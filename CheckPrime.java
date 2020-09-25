import java.util.Scanner;
public class CheckPrime{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a numbers");
       int num=sc.nextInt();

       boolean flag=false;
    
        if(num<=1){
            flag=false;
         }else{
            if(num==2){
               flag=true;
             }else{
              for(int i=2;i<num;i++){
                   if(num%i==0){
                       flag=false;
                       break;
                     }
                   flag=true;
                  } 
                
              } 
        }
        
       if(flag==true){
            System.out.println(num+" is a prime number ");
         }else{
            System.out.println(num+" is not a prime number ");
          } 
           
      }
   }