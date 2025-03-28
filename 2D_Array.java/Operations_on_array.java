import java.util.Scanner;
public class Operations_on_array {
    
//          Addition of two matrix:

public static void main(String[]args){

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of an Array:");
       int rows = sc.nextInt();
       int cols = sc.nextInt();
       int arr[][] = new int[rows][cols];
       int b[][] = new int[rows][cols];
       int c[][] = new int[rows][cols];
       System.out.println("Enter the elements of first matrix");
//        input
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < cols; j++) {
               arr[i][j] = sc.nextInt();
           }
       }

       System.out.println("Enter the elements of second matrix:");
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < cols; j++) {
               b[i][j] = sc.nextInt();
           }
       }

//        output
       System.out.println("Output without addition");
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < cols; j++) {
               System.out.print(arr[i][j] + " ");
           }
           System.out.println();
       }
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < cols; j++) {
               System.out.print(b[i][j] + " ");
           }
           System.out.println();
       }

//        input of addition matrix
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < cols; j++) {
               c[i][j] = arr[i][j] + b[i][j];
           }
       }

           System.out.println("Output after addition: ");

           for (int i = 0; i < rows; i++) {
               for (int j = 0; j < cols; j++) {
                   System.out.print(c[i][j] + " ");
               }
               System.out.println();
           }
}
}
