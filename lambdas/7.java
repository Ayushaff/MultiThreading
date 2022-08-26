class psp {
    public static void main(String[] args) {
        Runnable r; //runnable is funtional interface
        //lembda expression
        r = () -> {
            for (int i = 500; i < 550; i++)
                System.out.print(i + " ");
                try{
                    Thread.sleep(500);
                }catch(InterruptedException e){
                    System.out.println(e);
                }
        };

        //internally yha pr bhi ek anonymous class ban rhi h jisne runnable ko implements kia h or abstract run method ko defined is must & its anonymous class's object ko Runnable ke r ko assign kia

        Thread t=new Thread(r); 
        t.start();
        
        for (int i = 200; i <= 250; i++)
            System.out.print(i + " ");
        try {
            Thread.sleep(500);
        } catch (InterruptedException i) {
            System.out.println(i);
        }
    }
}