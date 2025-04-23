package Functions;

import java.util.Scanner;

public class find_geater_no {
    
    public static void greaterNumber(int a,int b){
        if(a>b){
            System.out.printf("%d is grater",a);
        }else{
            System.out.printf("%d is greater",b);
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number !");
        int a=sc.nextInt();
        System.out.println("Enter the second number !");
        int b=sc.nextInt();
        greaterNumber(a,b);
    }
}
