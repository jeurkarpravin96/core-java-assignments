import java.util.Scanner;
class PrimeCheckBeforeAfter{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter a numbers"); 
         int num=sc.nextInt();
         int count=0;
         for(int i=2;i<num;i++){
               
            if(num%i==0){
                count++;
            }
        }
       if(count==0){
          System.out.println("prime "+num);
       }
    }
}