package Functions;

import java.util.Scanner;

public class table {
    
    public static int table(int n){
        int num =1;
        for(int i=1;i<=10;i++){
            num=n*i;
            System.out.println(num);
        }
        return 0;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        table(n);
    }
}
