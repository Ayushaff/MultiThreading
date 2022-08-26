class psp {
    public static void main(String[] args) {
        Thread t = new Thread() {
            public void run() {
                for (int i = 500; i <= 550; i++) {
                    System.out.print(i + " ");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException ie) {
                        System.out.println(ie);
                    }
                }
            }
        };

        // anonymous class being made and its object's address has been sent to Thread's t object,which that anonymous class has extends Thread and we defined run and send
        // its anonymous objects to t
        t.start();

        for (int i = 200; i <= 250; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(50);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
    }
}