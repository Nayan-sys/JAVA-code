package Recursion;
public class factorial {
    public static void calcFactorial(int i,int n,int fact){
        if(i>n){
            // fact*=i;
            System.out.print("Factorial of given number is "+fact);
            return;
        }
        fact*=i;
        calcFactorial(i+1,n,fact);
    }
    public static void main(String[]args){
        int n,i;
        calcFactorial(1,5,1);
    }
}
