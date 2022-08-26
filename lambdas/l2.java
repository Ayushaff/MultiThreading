interface aaa {
    public int sam(int i);
}

class psp{
    public static void main(String[] args) {

        aaa a=(p)->{ return p*p; };
        
        System.out.println(a.sam(10));
        System.out.println("after 100lines");
          
        a=(p)-> p+p;

        System.out.println(a.sam(10));
        
    }
}