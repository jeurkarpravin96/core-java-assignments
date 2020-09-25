import java.util.Scanner;
class Q30{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Row of 2D array of array");
        int size=sc.nextInt();
        int a[][]=new int[size][size];
        System.out.println("Enter the element of array");
        for(int i=0;i<a.length;i++){
            System.out.println("Enter the element of in 1D array at "+i+" index");
            for(int j=0;j<a[i].length;j++){
                  a[i][j]=sc.nextInt();
            }
        }
      
        for(int i=0;i<size;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.println(" ");
        }

        
    }
}


