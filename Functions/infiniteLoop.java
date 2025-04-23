package Functions;

import java.util.Scanner;

public class infiniteLoop {
    
    public static void infiniteLoop(int n){
        int i=1;
        do{
            System.out.print(n);
            i++;
        }while(i<=i);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number!");
        int n=sc.nextInt();
        infiniteLoop(n);
    }
}
