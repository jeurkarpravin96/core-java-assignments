import java.util.Scanner;
class YearMonthDay{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the numbers of days");
   int days=sc.nextInt();
   int count=0;
   if(days>=365){
    count++;
    days=days-365;
   }
     int month=days/30;
     int day=days%30;
  System.out.println(count+" Year "+month+" Month "+day+" Day ");
 }
}