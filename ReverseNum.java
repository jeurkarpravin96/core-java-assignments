import java.util.Scanner;
public class ReverseNum{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a numbers");
       int num=sc.nextInt();
       int rev;
       int sum=0;
      
            while(Math.abs(num)>0){
              rev=num%10;
              sum=sum*10+rev;
              num/=10;
             }
         System.out.println("Reverse numbers is "+sum);
        
      }
   }