import java.util.Scanner;
public class ascending_order {
    Scanner sc=new Scanner(System.in);
       System.out.print("Enter the size of an array: ");
       int size=sc.nextInt();5
       
       int num[]=new int[size];
//        for taking input
       for(int i=0;i<num.length;i++){
           num[i]=sc.nextInt();
       }
//
       boolean isAscending = true;

       for(int i=0; i<num.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
           if(num[i] > num[i+1]) { // This is the condition for descending order
               isAscending = false;
           }
       }

       if(isAscending) {
           System.out.println("The array is sorted in ascending order");
       } else {
           System.out.println("The array is not sorted in ascending order");
       }

}
