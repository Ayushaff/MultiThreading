interface funtionalProcess {
    public void process(int p, int q);
}

class aaa {
    public void doSomething(funtionalProcess fp) {
        int x=10,y=10;
        fp.process(x, y);
    }
}

class psp{
    public static void main(String[] args) {
        aaa aa=new aaa();
        aa.doSomething((a,b)->{
            System.out.println(a+b);
        });
    }
}
