
import java.util.Scanner;
public class Finding_Length {
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of an array: ");
        int size=sc.nextInt();
        String a[]=new String[size];
        int length=0;
        for(int i=0;i<size;i++){
            a[i]=sc.nextLine();
            length+=a[i].length();
        }
        System.out.println("The length of the given string array is :"+length);

    }
}
