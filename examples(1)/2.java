class aaa extends Thread {
    aaa() {
        start();
    }

    public void sam() {
        System.out.println("sam ");
        for (int i = 100; i < 500; i++) {
            System.out.println("sam fun");
            System.err.println(i + "sam ");
        }
    }


}

class psp {
    public static void main(String[] args) {
        System.err.println("main psp");
        aaa a = new aaa();
        for (int i = 1; i <= 200; i++) {
            System.out.println("main psp fun");
            System.out.println(i + " ");
        }
    }
}
