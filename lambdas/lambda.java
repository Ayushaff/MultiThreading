import javax.sql.rowset.spi.SyncResolver;

interface aaa {
    public int sam(int p);
}

class psp {
    public static void main(String[] args) {
        aaa a = new aaa() {
            public int sam(int p) {
                return p + p;
            }
        };
        System.out.println(a.sam(10));
        System.out.println("after 100lines");
        a=new aaa(){
            public int sam(int e){
                return e*e;
            }

        };
        System.out.println(a.sam(2));

    }

}