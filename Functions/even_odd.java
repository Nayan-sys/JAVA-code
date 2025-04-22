package Functions;

import java.util.Scanner;

public class even_odd {
    
    public static int checkOddOrEven(int n){
        if(n%2==0){
            System.out.println("The number is even.");
        }
        else{
            System.out.println("The number is odd.");
        }
        return 0;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number! ");
        int n=sc.nextInt();
        checkOddOrEven(n);
    }
}
