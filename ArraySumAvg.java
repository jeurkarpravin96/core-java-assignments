import java.util.Scanner;
import java.text.DecimalFormat;
public class ArraySumAvg{
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       DecimalFormat df=new DecimalFormat(".###");
       int arr[]=new int[10];
       int sum=0;
       int len=arr.length;
       double avg=0;
         for(int i : arr){
           arr[i]=sc.nextInt();
           sum+=arr[i];
         }
        System.out.println("Sum of Array is "+sum);
        avg=(double)sum/(len); 
    
        System.out.println("Average of Array is "+df.format(avg));
        System.out.println("Average of Array is "+avg);
      }
   }