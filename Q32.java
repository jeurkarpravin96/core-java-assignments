class CheckThis{
    private int rollNo;
    private String name;
    static int i=0;
    void setData(int rollNo,String name){
            this.rollNo=rollNo;
            this.name=name;
            i++;
    }
    void show(){
        System.out.println(rollNo+" "+name);
        System.out.println("Number of object is "+i);
    }
}

class Q32{
    public static void main(String args[]) {
       CheckThis c=new CheckThis();
       c.setData(101,"pravin"); 
      // c.show();
       CheckThis c1=new CheckThis();
       c1.setData(101,"pravin"); 
      // c1.show();
       CheckThis c2=new CheckThis();
       c2.setData(101,"pravin"); 
       c2.show();
    }
}