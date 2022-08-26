class cmn extends Thread {

    private String something;

    public void keep(String something) {
        System.out.println("keep method ");
        this.something = something;

        System.out.println("ihave kept " + this.something + " now i m tired ,and im going to sleep");

        try {
            Thread.sleep(200);
            // now context switch

        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("now i m awake im picking wht i kept " + this.something );
    }
}

class worker extends Thread {
    private String something;
    private cmn someplace;

    worker(cmn someplace, String something) {
        this.someplace = someplace;
        this.something = something;
        start();
    }

    public void run() {
        System.out.println("run method");
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