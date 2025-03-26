import java.util.Scanner;
public class Check_order {
    //        State whether the given array is in ascending order or descending order:

    public static void main(String[]args){

       Scanner sc =new Scanner(System.in);
       System.out.println("Enter the size of an array:");
       int size=sc.nextInt();
       int a[]=new int[size];
//        For taking input:
       System.out.println("Enter the elements of an array:");
       for(int i=0;i<size;i++){
           a[i]=sc.nextInt();
       }
       if(a[0]>a[1]){
           System.out.println("Array is in descending order!");
       }else {
           System.out.println("Array is in ascending order!");
       }
    }
}
