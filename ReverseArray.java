import java.util.Scanner;
class ReverseArray{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numbers of element");
    int n=sc.nextInt();
    int arr[]=new int[n];
    int arr1[]=new int[n];
    int len=arr.length;
    System.out.println("Length of array is "+len);
 
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
     }    

    System.out.println("Element of array in reverse orders");

    for(int k=(len-1),j=0;k>=0;k--,j++){
         arr1[j]=arr[k];
       // System.out.println(arr[k]);
      }
    for(int j:arr1){
      System.out.println(j);
     }
   }
 }

