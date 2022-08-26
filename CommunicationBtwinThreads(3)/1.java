import javax.sql.rowset.spi.SyncResolver;
import javax.swing.plaf.synth.SynthScrollPaneUI;
//this too need a synchronization but as different as usual

class mdm {
    private int num;

    public void setNum(int num) {
        this.num = num;
        System.out.println("produced : " + this.num);
    }

    public int getNum() {
        System.out.println("consuming : " + this.num);
        return this.num;
    }

}

class producer extends Thread {
    private mdm medium;

    producer(mdm medium) {
        this.medium = medium;
        start();
    }

    public void run() { // producing nums
        for (int i = 200; i <= 250; i++)
            this.medium.setNum(i);
    }
}

class consumer extends Thread {
    private mdm medium;

    consumer(mdm medium) {
        this.medium = medium;
        start();
    }

    public void run() { // consuming nums
        int y;
        for (int i = 0; i < 50; i++)
            y = this.medium.getNum();

    }
}

class psp {
    public static void main(String[] args) {
        mdm medium = new mdm();

        producer p = new producer(medium);
        consumer c = new consumer(medium);
    }
}