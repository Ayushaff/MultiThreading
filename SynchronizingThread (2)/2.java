import java.net.CacheRequest;

import javax.xml.catalog.Catalog;

//sync all methods to work synchronizingly

class cmn extends Thread {
    private String something;

    synchronized public void keep(String somthing) {
        this.something = somthing;
        System.out.println("i have kept \" " + this.something + " \" now im going to sleep");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("im awake im picking what i kept \" " + this.something + " \" ");
    }

    synchronized public void tell(String somthing) {
        System.out.println("u send \" " + somthing + " \" ");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(" again u  send \" " + somthing + " \" ");

    }

}

class worker extends Thread {
    private cmn someplace;
    private String something;

    worker(cmn somplace, String somthing) {
        this.someplace = somplace;
        this.something = somthing;
        start();
    }

    public void run() {
        this.someplace.keep(something);
        this.someplace.tell(something);
    }
}

/*
 * class aaa extends Thread {
 * 
 * aaa() {
 * System.out.println("default constr");
 * start();
 * }
 * 
 * public void sam() {
 * for (int i = 0; i < 10; i++) {
 * System.out.println("sam " + i + " ");
 * }
 * 
 * }
 * 
 * public void run() {
 * System.out.println("run");
 * this.sam();
 * }
 * }
 */
// class gjb extends Thread {
// gjb() {
// start();
// }
//
// public void sam(){
// for(int i=0;i<15;i++) {
// System.out.println("sam " + i+ " " );
// }
// }
//
// try{
// Thread.sleep(1000);
// }catch(InterruptedException e)
// {
// System.out.println(e);
// }
//
// public void run(){
// this.sam();
// }
// }
//
class psp {
    public static void main(String[] args) {
        cmn someplace = new cmn();

        worker w1 = new worker(someplace, "gold");
        worker w2 = new worker(someplace, "silver");
        worker w3 = new worker(someplace, "diamond");

        // worker w4=new worker(somplace, "gajab");

    }
}