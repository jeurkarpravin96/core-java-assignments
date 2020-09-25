
import java.util.Scanner;
class SortArrayDesc{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Size of element");
    int n=sc.nextInt();
    int arr[]=new int[n];
   for(int i=0;i<arr.length;i++){
         arr[i]=sc.nextInt(); 
     }

   //logic part
  
        for(int i=0;i<arr.length;i++){
             for(int j=(i+1);j<arr.length;j++){
                  if(arr[i]<arr[j]){
                      int temp=arr[i];
                           arr[i]=arr[j];
                           arr[j]=temp;
                  }
               }
            }
    
      for(int i:arr){
       System.out.print(" "+i);
      
   }
 }
}