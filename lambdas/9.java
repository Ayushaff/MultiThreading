class psp {
    public static void main(String[] args) {
        Thread t;
        t = new Thread(new Runnable() {
            public void run() {
                for (int i = 500; i <= 550; i++) {
                    System.out.print(i + " ");
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        System.out.println(e);
                    }
                } 
            }
        });
        // thread ke constructor ko anonymous class ke object ka address pass kia h jisne runnable ko implements kia h
        t.start();

        for (int i = 200; i <=250; i++) 
        {
            System.out.print(i + " ");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
