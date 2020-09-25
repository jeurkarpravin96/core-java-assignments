import java.util.Scanner;
import java.text.DecimalFormat;
class Percent{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("###.###");
    System.out.println("Enter a marks obtain in Os out of 100");
    int s1=sc.nextInt();
    System.out.println("Enter a marks obtain in AWP out of 100");
    int s2=sc.nextInt();
    System.out.println("Enter a marks obtain in Mean Stack out of 100");
    int s3=sc.nextInt();
    System.out.println("Enter a marks obtain in CPP out of 100");
    int s4=sc.nextInt();
    System.out.println("Enter a marks obtain in DS out of 100");
    int s5=sc.nextInt();
    int sum=s1+s2+s3+s4+s5;
    double percent=((double)sum/500)*100;
    System.out.println("percentage marks = "+df.format(percent)); 
  }
}