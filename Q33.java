class CheckThis{
    private int rollNo;
    private String name;

    void setData(int rollNo,String name){
            this.rollNo=rollNo;
            this.name=name;
    }
    void show(){
        System.out.println(rollNo+" "+name);
    }
}

class Q33{
    public static void main(String args[]) {
       CheckThis c=new CheckThis();
       c.setData(101,"pravin"); 
       c.show();
    }
}