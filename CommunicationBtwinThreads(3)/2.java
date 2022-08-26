class mdm {
    private int num = 0;
    boolean b = false;
    int c = 0;

    synchronized public void setNum(int n) {
        
        if (b == true) {// b==true means produced we dont need to start this thread again set it to wait mode because its time to consume whatever setNum() produced
            try {
                wait();
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }

        // means b==false not yet produced ,so produce
        this.num = n;
        b = true;
        notify();

        System.out.println("produced : " + this.num);
    }

    synchronized public int getNum() {
        if (b == false) // b==false not yet produced  no need to start this thread go on wait mode! need to look after produced thread
        {
            try {
                wait();
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }

        // b==true means produced but not yet consumed so consume pls
        b = false;
        notify();
        System.out.println("consumed :" + this.num);
        return this.num;
    }
}

class produced extends Thread {
    private mdm medium;

    produced(mdm medium) {
        this.medium = medium;
        start();
    }

    public void run() {
        for (int i = 200; i != 250; i++)
            this.medium.setNum(i);
    }
}

class consumer extends Thread {
    private mdm medium;

    consumer(mdm medium) {
        this.medium = medium;
        start();
    }

    public void run() {
        int y;
        for (int i = 0; i < 50; i++)
            y = this.medium.getNum();
    }
}

class psp {
    public static void main(String[] args) {
        mdm medium = new mdm();

        produced p = new produced(medium);
        consumer c = new consumer(medium);
    }
}