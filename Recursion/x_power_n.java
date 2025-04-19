package Recursion;

public class x_power_n {
    
   public static int printPower(int x,int n){
       if(n==0){
           return 1;
       }
       if(x==0){
           return 0;
       }
       int xprn=printPower(x,n-1);
       int xpowern=x*xprn;
       return xpowern;
   }

   public static void main(String[]args){

    
    int x=2;
    int n=5;
//        System.out.println(printPower(x,n));
    int ans=printPower(x,n);
    System.out.println(ans);
}
}
