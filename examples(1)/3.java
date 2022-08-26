
class aaa extends Thread {

    aaa() {
        System.out.println("default constr");
        start();
    }

    public void sam() {
        for (int i = 0; i < 10; i++) {
            System.out.println("sam " + i + " ");
        }

        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            System.out.println(e);
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
        psp p = new psp();
        p.zam();
    }

    public void zam() {
        for (int i = 0; i < 20; i++) {

            System.out.println("zam " + i + " ");
        }
        try {
            Thread.sleep(250);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}