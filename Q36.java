class MathOperation{

    void multi(int i,int j){
        int k=i*j;
     System.out.println("multification of two integers is "+k);
    }

    void multi(float i,float j,float k){
        float f=i*j*k;
     System.out.println("multification of Three floats is "+k);
    }

    int multi(int a){
         return a;
      }

    void multi(double i,int j){
      double k=i*j;
       System.out.println("multification of one double one int is "+k);
    }
}

class Q36{
    public static void main(String args[]){
        MathOperation m=new MathOperation();
        int multi=1;
        m.multi(2,3);
        m.multi(2.25f,3.23f,3.2f);
        m.multi(2.25,3);

        int a[]={1,2,3};

        for(int i=0;i<a.length;i++){
          int b= m.multi(a[i]);
          multi=multi*b;
        }
    System.out.println("Multification of array element is "+ multi);
    }
}