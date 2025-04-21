package Functions;

import java.util.Scanner;

public class multiplication {
    
    public static int multiplication(int a,int b){
        int multiply=a*b;
        System.out.println("Multiplication of both the numbers are : "+ multiply);
        return 1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a=sc.nextInt();
        System.out.print("Enter the second number: ");
        int b=sc.nextInt();
        multiplication(a,b);
    }
}
