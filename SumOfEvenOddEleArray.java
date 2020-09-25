import java.util.Scanner;
class SumOfEvenOddEleArray{
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no. of element you want in array");
     int n=sc.nextInt();
     int arr[]=new int[n];
     int len=arr.length;
     int sumEven=0;
     int sumOdd=0;
    for(int i=0;i<len;i++){
      arr[i]=sc.nextInt(); 
     }
    
     for(int j=0;j<len;j++){
         if(arr[j]%2==0){
          sumEven+=arr[j]; 
          }else{
          sumOdd+=arr[j];
         }
    }
   System.out.println("Sum of even Element "+sumEven);
   System.out.println("Sum of odd Element "+sumOdd);
  }
}