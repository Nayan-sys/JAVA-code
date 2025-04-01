
import java.util.Scanner;
public class Compare {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first String: ");
        String a=sc.nextLine();
        System.out.print("Enter the second String: ");
        String b=sc.nextLine();
        if(a.compareTo(b)==0){
            System.out.println("Both strings are equal");
        }else if(a.compareTo(b)>0){
            System.out.println("String a is Greater then String b");
        }else if(a.compareTo(b)<0){
            System.out.println("String b is Greater then String a");
        }
    }
}
