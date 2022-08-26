

//if method is not declared as synchronized then keep that call in synchronized block + send that object's address as argument from which we called that method , whose method we need to be work as synchronizingly

//following class has been created in 2019
class cmn extends Thread {
    private String something;

    synchronized public void keep(String somthing) {
        this.something = somthing;
        
        System.out.println("i have kept \" " + this.something + " \" now im going to sleep");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("im awake im picking what i kept \" " + this.something + " \" ");
    }

    public void tell(String somthing) {
        System.out.println("u send \" " + somthing + " \" ");
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(" again u  send \" " + somthing + " \" ");
    }
}

// following class is being created in 2020
class worker extends Thread {
    private cmn someplace;
    private String something;

    worker(cmn somplace, String somthing) {
        this.someplace = somplace;
        this.something = somthing;
        start();
    }
 
    public void run() {
        this.someplace.keep(something);
        synchronized (someplace) {
            this.someplace.tell(something);
        }
    }
}

class psp {
    public static void main(String[] args) {
        cmn someplace = new cmn();

        worker w1 = new worker(someplace, "gold");
        worker w2 = new worker(someplace, "silver");
        worker w3 = new worker(someplace, "diamond");

    }
}