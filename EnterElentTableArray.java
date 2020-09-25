import java.util.Scanner;
class EnterElentTableArray{
  public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a any Numbers ");
     int n=sc.nextInt();
     System.out.println("Table of "+n);
     for(int i=1;i<=10;i++){
       System.out.println(n*i);
    }
  }
}