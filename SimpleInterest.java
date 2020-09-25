import java.util.Scanner;
class SimpleInterest{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the Principle Amount");
   int p=sc.nextInt();
   System.out.println("Enter the rate of interest");
   int r=sc.nextInt();
   System.out.println("Enter the time duration");
   int t=sc.nextInt();
   double simple=(double)(p*r*t)/100;
  System.out.println("Simple Interest is "+simple);
 }
}