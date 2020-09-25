import java.util.Scanner;
import java.text.DecimalFormat;
class Temp{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   DecimalFormat df=new DecimalFormat(".##");
   System.out.println("Enter the Temperature in Fahrenheit");
   int F=sc.nextInt();
   double celsius=(double)((F-32)*5)/9;
   System.out.println("Temperature in Celsius "+df.format(celsius));
 }
}