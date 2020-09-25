import java.util.*;
import java.io.*;
public class CheckLeap{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
     System.out.println("Enter a year to check is leap year ro not");
     int year=sc.nextInt();
      if( (year%4==0) && (year%100!=0) || (year%400==0) ){
        System.out.println(year+" is leap year");
      }else{
         System.out.println(year+" is not a leap year");   
   }   
 }
}