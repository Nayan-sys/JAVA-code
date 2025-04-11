package Bit_Manipulation;
import java.util.Scanner;
public class swap {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter first number: ");
    int a=sc.nextInt();
    System.out.print("Enter the second number: ");
    int b=sc.nextInt();
    System.out.print("Before swapping a= "+a);
    System.out.println(" ");
    System.out.print("Before swapping b="+b);
    System.out.println(" ");
    a=a^b;
    b=a^b;
    a=a^b;
    System.out.print("After swapping a="+a);
    System.out.println(" ");
    System.out.print("After swapping b="+b);
    }

}
