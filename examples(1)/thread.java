import javax.sql.rowset.spi.SyncResolver;

class aaa implements Runnable {
    aaa() {
        Thread t1 = new Thread(this);
        t1.start();
        Thread t2=new Thread(this);
        t2.start();
    }

    public void run() {
        for (int i = 100; i < 400; i+=10) {
            System.err.println("run"+i + " ");
        }
    }
}

class psp {
    public static void main(String[] args) {

        aaa a = new aaa();
        for (int i =20; i < 212; i+=20){
            System.err.println("psp"+i + " ");
        }
    }

}
