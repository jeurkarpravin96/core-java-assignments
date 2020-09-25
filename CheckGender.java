import java.util.*;
public class CheckGender{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
     System.out.println("Enter a Gender (Male or Female)");
     char sex=sc.next().charAt(0);
     System.out.println("Enter a Age");
     int age=sc.nextInt();
      
   boolean CheckEligible= ((sex=='M' || sex=='m') && age>=21) || ((sex=='F'|| sex=='f') && age>=18)? true:false;
        
 
        if(CheckEligible==true){
          System.out.println("person is eligible for marriage ");
        }else{
          System.out.println("person is not eligible for marriage ");
        }
   }
}