
import java.util.Scanner;
public class Substring {
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name you want to display");
        String name=sc.nextLine();
        System.out.println("Name displayed before using substring function : " + name);
        System.out.print("Name displayed after using substring function : ");
        System.out.print(name.substring(0,5));
    }
}
