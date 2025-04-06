package Bit_Manipulation;
import java.util.Scanner;
public class Update {
    public static void main(String[] args) {
        
//        UPDATE operation: {update the 2nd bit(position=1) of a number =0101}

       Scanner sc=new Scanner(System.in);
       int ch=sc.nextInt();
       int n=5;
       int pos=1;
       int bitMask=1<<pos;
       if(ch==0){
           int newBitMask=~(bitMask);
           int newNumber=newBitMask & n;
           System.out.println(newNumber);
       }else if(ch==1){
           int newNumber=bitMask | n;
           System.out.println(newNumber);
       }else{
           System.out.println("Invalid choice!");
       }
    }
}
