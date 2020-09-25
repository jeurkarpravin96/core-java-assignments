import java.util.Scanner;
public class EmpGrossSalary{
  public static void main(String[] args){
  
     System.out.println("Enter a Basic Salary of Employee");
     Scanner sc=new Scanner(System.in);
      int salary=sc.nextInt(); 

      if(salary<10000){
         double HRA=0.10 * (double)salary;
         double DA= 0.90 * (double)salary;
         double GS= (double)salary + DA + HRA;
         System.out.println("Gross salary is "+GS);
      }else if(salary==10000){
         double HRA=2000;
         double DA= 0.98 * (double)salary;
         double GS= (double)salary + DA + HRA;
         System.out.println("Gross salary is "+GS);
     }
   }
}