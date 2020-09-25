import java.util.Scanner;
class Circle{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter Radius of circle ");
    int r=sc.nextInt();
    double area=3.14*r*r;
    double circum=2*3.14*r;
    System.out.println("Area of cirlce is "+area);
    System.out.println("Circumference is "+circum); 
  }
}