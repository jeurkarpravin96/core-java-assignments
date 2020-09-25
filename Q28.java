import java.util.Scanner;
class Q28{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a size of array");
        int size=sc.nextInt();
        String a[]=new String[size];
        System.out.println("Enter the element of array");
        for(int i=0;i<a.length;i++){
           a[i]=sc.next();
        }
        System.out.println("Reading array element using for each loop");
        for(String i : a){
            System.out.println(i);
        }
    }
}