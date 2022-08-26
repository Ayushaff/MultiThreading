class aaa extends Thread {
    aaa() {
        start();
    }

    public void run() {
        for (int i = 1301; i != 1500; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class psp {
    public static void main(String[] args) {
        aaa a = new aaa();

        for (int i = 201; i <= 250; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }

        try {
            a.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        for (int i = 500; i <= 550; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("main threads working n processing should always ends after every other threads has done their works");
    }
}