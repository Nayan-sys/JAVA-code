import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
                Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int size=sc.nextInt();
        String a[]=new String[size];
        
       System.out.println("Enter the elements of an array!");
       for(int i=0;i<size;i++){
           a[i]=sc.next();
       }
       System.out.println("String before reverse is ");
       for(int i=0;i<size;i++){
           System.out.print(a[i]+" ");
       }
       System.out.println("");
       System.out.println("String after reverse is");
        for(int i=0;i<size/2;i++){
             String temp=a[i];
            a[i]=a[size-i-1];
            a[size-i-1]=temp;
        }
        // System.out.println("String after reverse is");
        for(int i=0;i<size;i++){
            System.out.print(a[i]+" ");
        }
    }
}

