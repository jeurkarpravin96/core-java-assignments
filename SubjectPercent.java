import java.util.Scanner;
import java.text.DecimalFormat;
class Percent{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    DecimalFormat df=new DecimalFormat(".##");
    System.out.println("Enter no. of subjects");
    int n=sc.nextInt();
    int sum=0;
    for(int i=0;i<n;i++){
       int marks=sc.nextInt();
       sum+=marks;
    }
    int totalmark=n*100;
    double percent=((double)sum /totalmark)*100;
    System.out.println("percentage marks = "+df.format(percent)+" %"); 
  }
}