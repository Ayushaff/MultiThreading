class psp {
    public static void main(String[] args) {
        Thread t;
        t = new Thread(() -> {
            for (int i = 500; i < 550; i++)
                System.out.print(i + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        });
    }
}
