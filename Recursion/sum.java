package Recursion;
import java.util.Scanner;
public class sum {
    
        public static void printSum(int n,int i,int sum){
            if(i==n){
                sum+=i;
                System.out.print("The sum of natural number to the limit given by the user is: "+sum);
                return;
            }
            sum+=i;
            printSum(n,i+1,sum);
        
        }
        public static void main(String[]args){

            //        Print the sum of all n natural number using recursion function:
            
                  Scanner sc=new Scanner(System.in);
                   System.out.print("Enter the limit: ");
                   int n=sc.nextInt();
                   printSum(5,1,0);



}
}
