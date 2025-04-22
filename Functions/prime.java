package Functions;

import java.util.Scanner;

public class prime {
    
    public static void checkPrime(int n){
        int counter =0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                counter++;
            }
        }
        if(counter==2){
            System.out.printf(" %d is prime number!",n);
        }else {
            System.out.printf(" %d is not a prime number!",n);
        }
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number! ");
        int n=sc.nextInt();
        checkPrime(n);
    }
}
