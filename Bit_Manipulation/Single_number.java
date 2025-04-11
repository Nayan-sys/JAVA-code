package Bit_Manipulation;
import java.util.Scanner;
public class Single_number {
    
        public static void singleNumber(int[] nums) {
            int result = 0;
            for (int i = 0; i < nums.length; i++) {
                result ^= nums[i];
            }
            System.out.println("The number which is not repeating is: "+result);
        }
   
    
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of an array");
    int size=sc.nextInt();
    int nums[]=new int[size];
    System.out.println("enter elements");
    for(int i=0;i<size;i++){
        nums[i]=sc.nextInt();
    }
    
    singleNumber(nums);


    
}
}
