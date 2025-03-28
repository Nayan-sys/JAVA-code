import java.util.Scanner;
public class Searching {
    
//        Take input of elements from the user and search the element that occur int that array at which index:

public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of an array: ");
       int rows=sc.nextInt();
       int cols=sc.nextInt();
       int num[][]=new int[rows][cols];
//        for input:
       System.out.println("Enter the elements of an array:");
       for(int i=0;i<rows;i++){
           for(int j=0;j<cols;j++){
               num[i][j]=sc.nextInt();
           }
       }
       System.out.println("Enter the element u want to search:");
       int n=sc.nextInt();
//        for search of the elements:
       for(int i=0;i<rows;i++){
           for(int j=0;j<cols;j++){
               if(n==num[i][j]){
                   System.out.println("The element is found at (" + i +","+ j + ")");
               }
           }
       }
}
}
