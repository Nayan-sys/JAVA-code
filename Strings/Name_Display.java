import java.util.Scanner;
public class Name_Display {
    public static void main(String args[]){
        
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter the name you want to print:");
               String name=sc.nextLine();
               System.out.println("The name after using charAt() function:");
               for(int i=0;i<name.length();i++){
                   System.out.println("The word at index "+i+ " is "+ name.charAt(i));
               }
}
}
