import java.util.Scanner;
public class min_max {

    
   public static void main(String []args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of an array! ");
       int size = sc.nextInt();
       int a[] = new int[size];
       System.out.print("Enter the elements of an array: ");
       for (int i = 0; i < size; i++) {
           a[i] = sc.nextInt();
       }
       int min = a[0];
       int max=a[0];
       for (int i = 0; i < size; i++) {
           if (a[i] < min) {
               min = a[i];
           } else {
               max=a[i];
           }
       }
       System.out.println("Smallest number in an array is " + min);
       System.out.println("Maximum number in an array is " + max);

   }


}
