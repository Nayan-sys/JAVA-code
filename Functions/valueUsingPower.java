package Functions;

import java.util.Scanner;

public class valueUsingPower {
    
    public static void main(String[] args) {
        System.out.println("Enter 1 for square the number\nEnter 2 for cube the number!\nEnter 3 for quadratic the number\nEnter 4 for 5 times multiply the numbers!");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        switch(ch){
            case 1:
                System.out.print("Enter the number! ");
                int x=sc.nextInt();
                int num=1;
                num=x*x;
                System.out.println(num);
                break;
            case 2:
                System.out.print("Enter the number! ");
                 x=sc.nextInt();
                 num=1;
                num=x*x*x;
                System.out.println(num);
                break;
            case 3:
                System.out.print("Enter the number! ");
                x=sc.nextInt();
                num=1;
                num=x*x*x*x;
                System.out.println(num);
                break;
            case 4:
                System.out.print("Enter the number! ");
                x=sc.nextInt();
                num=1;
                num=x*x*x*x*x;
                System.out.println(num);
                break;
        }
    }
}
