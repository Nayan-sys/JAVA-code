package Functions;

import java.util.Scanner;

public class sum_of_odd_no {
    
    public static void sumOdd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2==1){
                sum=sum+i;
            }
        }
        System.out.printf("Sum is %d",sum);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range!");
        int n=sc.nextInt();
        sumOdd(n);
    }
}
