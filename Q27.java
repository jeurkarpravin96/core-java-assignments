import java.util.Scanner;
class Q27{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int a[]=new int[size];
        int len=a.length;
        System.out.println("Enter Array element");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            for(int j=(i+1);j<a.length;j++){
                 if(a[i]>a[j]){
                int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                 }
            }
        }

        // for(int i=0;i<a.length;i++){
        //     System.out.println(a[i]);
        // }

        System.out.println("max "+a[len-1]);
        System.out.println("min "+a[0]);
    }
}