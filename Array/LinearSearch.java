import java.util.Scanner;

public class LinearSearch {
 
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of an array!");
     int size=sc.nextInt();
     int number[]=new int[size];
//      For input!
     for(int i=0;i<size;i++){
             number[i]=sc.nextInt();
         }
//      For output!
       for(int i=0;i<size;i++){
           System.out.println(number[i]);
       }
     System.out.print("Enter the number you want to search! ");
     int num=sc.nextInt();
       for(int i=0;i<size;i++){
           if(number[i]==num){
               System.out.println("number is found at index:"+ i);
               break;
           }
           }
       }
    }
    

