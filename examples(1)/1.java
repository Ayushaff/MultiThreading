class aaa implements Runnable {
    aaa() {
        Thread t = new Thread(this); // jvm dekhega memory me 2 threads time slicing and multithreading ho jaygi

        t.start();
        // the run will be loaded on thread
    }

    public void sam() {
        System.out.println("sam funtion");
        for (int i = 0; i < 25; i++) {
            System.out.println("sam fun " + i + " sam");
        }
    }

    public void run() {
        System.out.println("run");
        this.sam();       
    }
}

class psp {
    public static void main(String[] args) {
        aaa a = new aaa();
        System.err.println("main funtion psp");
        for (int i = 0; i < 40; i++) {
            System.out.println("main psp fun " + i + " psp ");

        }
    }
}