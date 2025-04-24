package Functions;

import java.util.Scanner;

public record ReadInputandSum() {
    
    public static void sum(int a,int b){
        int c=a+b;
        System.out.println("The sum of the given numbers is:"+ c);
        return;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        sum(a,b);
    }
}
