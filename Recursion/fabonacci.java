package Recursion;

public class fabonacci {

    
   public static void calcFibonacci(int a,int b,int n) {
       if(n==0){
           return;
       }
       int c=a+b;
       System.out.print(" "+c);
       calcFibonacci(a=b,b=c,n-1);
   }
   public static void main(String[]args){
       int a=0;
       int b=1;
       int n=7;
       System.out.print(" "+a);
       System.out.print(" "+b);
       calcFibonacci(a,b,n-2);
}
}
