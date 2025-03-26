package Two_D_Array.java;
import java.util.Scanner;

public class Transpose {

    //        Problem 2 transpose of an array!

    public static void main(String[]args){

       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the rows of array: ");
       int row=sc.nextInt();
       System.out.print("Enter the column of an array: ");
       int cols=sc.nextInt();
       int num[][]=new int[row][cols];
       System.out.println("Enter the elements of an array:");
       for(int i=0;i<row;i++){
           for(int j=0;j<cols;j++){
               num[i][j]=sc.nextInt();
           }
       }
//        Print of array:
       System.out.println("Elements of an array:");
       for(int i=0;i<row;i++){
           for(int j=0;j<cols;j++){
               System.out.print(num[i][j]+" ");
           }
           System.out.println();
       }
//         Transpose of array
       System.out.println("Transpose of an array:");
       for(int i=0;i<row;i++){
           for(int j=0;j<cols;j++){
               System.out.print(num[j][i]+" ");
           }
           System.out.println();
       }
    
}
}
