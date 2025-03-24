import java.util.Scanner;
public class Arrays {


//    Problem 1! Read the name from the user and print the name:
     public static void main(String []args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the size of an array: ");
         int size = sc.nextInt();
         String name[] = new String[size];
//        For input names:
         for (int i = 0; i < size; i++) {
             name[i] = sc.next();
         }
//        For output names
         for (int i = 0; i < size; i++) {
             System.out.println("In the array at index " + i + " The name given by the user is " + name[i]);
         }
     }
}