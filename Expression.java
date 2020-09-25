import java.util.Scanner;
class Expression{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  boolean flag=true;
  while(flag){
  System.out.println(" ");
  System.out.println("[1] y = x^2 + 3x - 7 (print value of y) ");
  System.out.println("[2] y = x++ + ++x (print value of x and y) ");
  System.out.println("[3] z = x++ - --y - --x  +  x++ (print value of x ,y and z)");
  System.out.println("[4] z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]");
  System.out.println(" ");
  System.out.println("Enter a Choice");
  int i=sc.nextInt();
  switch(i){
     case 1:
         System.out.println("Enter a value of x");
         int x=sc.nextInt();
         double y=Math.pow(x,2)+3*x-7;
         System.out.println("Value of  y is "+ y);
         System.out.println(" ");
         break;
     case 2:
          System.out.println("Enter a value of x");
          int x1=sc.nextInt();
          int y1 =x1++ + ++x1;
          System.out.println("Value of x is "+x1+" and y is "+y1);
          System.out.println(" ");
          break;
     case 3:
          System.out.println("Enter a value of x");
          int x2=sc.nextInt();
          System.out.println("Enter a value of y");
          int y2=sc.nextInt();
          double z = x2++ - --y2 - --x2  +  x2++;
          System.out.println("value of x is "+x2+", y is " +y2 +" and z is "+z);
          System.out.println(" ");
          break;
    case 4:
          System.out.println("Enter the value of x");
          int x3=sc.nextInt();
          boolean xb=(x3>0)? true:false;
          System.out.println("Enter the value of y");
          int y3=sc.nextInt();
          boolean yb=(y3>0)? true:false;
          boolean z2 = xb && yb || !(xb || yb);
          System.out.println("value of x is "+xb+", y is "+yb+" and z is " +z2);
          break;
     default:
         System.out.println("Invalid choice");
         flag=false;
    } 
   }
  }
}