package Functions;

import java.util.Scanner;

public class armstrong {
    
    public static void armstrong(int n){
        int r;int c=n;int arm=0;

        for(int i=n;i>0;i--){
            r=n%10;
            arm=(r*r*r)+arm;
            n=n/10;
        }
        if(c==arm){
            System.out.printf("%d is armstrong number!",c);
        }
        else{
            System.out.printf("%d is not an armstrong number!",c);
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to check!");
        int n=sc.nextInt();
        armstrong(n);
    }
}
