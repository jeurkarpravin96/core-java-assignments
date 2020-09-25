import java.util.Scanner;
class SearchEleInArray{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numbers of element");
    int n=sc.nextInt();
    int arr[]=new int[n];
    int len=arr.length;
    System.out.println("Length of array is "+len);
 
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
     }    

    System.out.println("Enter the Element to search");
    int num=sc.nextInt();
    int count=0;
    int index=0;
     for(int j=0;j<len;j++){
          if(num==arr[j]){
           count++;
           index=j;
          }
     }
    if(count<=0){
     System.out.println("You want to search Element is "+num+" Not Present in Array");
     }else{
     System.out.println("You want to search Element is "+num+" Present at "+index+" index ");           
     }
   }
 }

