package Functions;

import java.util.Scanner;

public class palindrome {
        public static void palindrome(int n){
        int r;int c=n;int p=0;

        for(int i=n;i>0;i--){

            r=n%10;
            p=(p*10)+r;
            n=n/10;
        }
        if(c==p){
            System.out.printf("%d is palindrome number!",c);
        }
        else{
            System.out.printf("%d is not palindrome number!",c);
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to check!");
        int n=sc.nextInt();
        palindrome(n);
    }
}
