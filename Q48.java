abstract class processor{
     double data;
   void showData(){
        System.out.println("Ans = "+data);
    }
    abstract void process();
}

class Fractoril extends processor{
void process(){
    int fact=1;
    int num=5;

    for(int i=1;i<=5;i++){
        fact=fact*i;
    }
     data=fact;
   }
}

class Circle extends processor{
    void process(){
         int radius=2;
         double area=3.14*radius*radius;
         data=area;
       }
    }
    

class Q48{
    public static void main(String args[]) {
        processor p=new Fractoril();
        p.process();
        p.showData();
        processor p1=new Circle();
        p1.process();
        p1.showData();
    }
}