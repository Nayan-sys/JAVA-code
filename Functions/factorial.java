package Functions;

import java.util.Scanner;

public class factorial {
    
    public static void calculateFactorial(int n){
        if(n<0){
            System.out.println("Invalid number");
            return;
        }
        int factorial =1;
        for(int i=n;i!=0;i--){

            factorial= factorial*i;
        }
        System.out.println("The factorial of the number is: " + factorial);
        return;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        calculateFactorial(n);
    }
}
