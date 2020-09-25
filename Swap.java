import java.util.Scanner;
class Swap{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter a Number");
   int x=sc.nextInt();
   System.out.println("Enter a another Number");
   int y=sc.nextInt();
  System.out.println("value of x and y Before swap is "+x+" and "+y);
    x=x+y;
    y=x-y;
    if(x>y){
      x=x-y;
     }else{
       x=y-x;
     }
   System.out.println("value of x and y After swap is "+x+" and "+y);
 }
}