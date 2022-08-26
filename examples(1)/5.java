class cmn extends Thread {

    private String something;

    public void keep(String something) {

        this.something = something;
 
        System.out.println("ihave kept " + this.something + " now i m tired ,and im going to sleep");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
 
        System.out.println("now i m awake im picking wht i kept " + this.something + "\n");
    }
}

class worker implements Runnable {
    private String something;
    private cmn someplace;

    worker() {        
        Thread t = new Thread();
        t.start(); 
    }

    worker(cmn someplace, String something) {
        this.someplace = someplace;
        this.something = something;
    }

    public void run() {
        this.someplace.keep(this.something);
    }
}

class psp {
    public static void main(String[] args) {

        cmn someplace = new cmn(); // 1000 address

        worker worker1 = new worker(someplace/* 1000 */, "gold");
        worker worker2 = new worker(someplace/* 1000 */, "silver");
        worker worker3 = new worker(someplace/* 1000 */, "diamond");
    }
}