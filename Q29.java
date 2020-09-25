import java.util.Scanner;
class Q29{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Row of 2D array of array");
        int size=sc.nextInt();
        int a[][]=new int[size][];
        System.out.println("Enter the element of array");
        for(int i=0;i<a.length;i++){
            System.out.println("Enter the size of in 1D array at "+i+" index");
            int col=sc.nextInt();
             a[i]=new int[col];
            System.out.println("Enter the element of in 1D array at "+i+" index");
            for(int j=0;j<a[i].length;j++){
                  a[i][j]=sc.nextInt();
            }
        }
      
        int OneD=0;
        int TwoD=0;

        for(int i=0;i<size;i++){
            OneD=0;
            TwoD++;
            for(int j=0;j<a[i].length;j++){
            //    System.out.print(" "+a[i][j]);
            OneD++;
            }
            System.out.println("Element at "+i+" index "+OneD);
        }
        System.out.println("1D array in 2D array "+TwoD);
    }
}



// class Q29{
//     public static void main(String args[]) {
//         int arr[][]={
//             {1,2,3,},
//             {5,4,2,2,},
//             {1,2,3,4,5},
//             {9,8,7,6}
//         };

//         int OneD=0;
//         int TwoD=0;

//         for(int a[] : arr){
//             TwoD++;
//             OneD=0;
//              for(int i : a){
//                 OneD++;
//              }
//            System.out.println(OneD);
//         }
//         System.out.println(TwoD);
//     }
// }
