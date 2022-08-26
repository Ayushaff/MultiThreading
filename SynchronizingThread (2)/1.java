class cmn extends Thread {
    private String something;

    synchronized public void keep(String smthing) {
        this.something = smthing;
        System.out.println("i have kept " + this.something + " now im going to sleep");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("im awake im picking what i kept " + this.something);
    }
}

class worker extends Thread {
    private String smthing;
    private cmn somplace;

    worker(cmn somplace, String smthing) {
        this.smthing = smthing;
        this.somplace = somplace;
        start();
    }

    public void run() {
        this.somplace.keep(this.smthing);
    }
}

class psp {
    public static void main(String[] args) {
        cmn somplace = new cmn();
        worker w1 = new worker(somplace, "Gold");
        worker w2 = new worker(somplace, "Silver");
        worker w3 = new worker(somplace, "Diamond");
    }
}