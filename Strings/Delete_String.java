import java.util.Scanner;
public class Delete_String {
    public static void main(String[]args){
        
//        Enter the email from the user and create username after deleting @ part from an email:

Scanner sc=new Scanner(System.in);
System.out.print("Enter the email of the user: ");
String email=sc.nextLine();
String username="";
for(int i=0;i<email.length();i++){
    if(email.charAt(i)=='@'){
    break;
    }else{
        username+=email.charAt(i);
    }
}
System.out.print("Username created from the email is: "+username);
}
    }

