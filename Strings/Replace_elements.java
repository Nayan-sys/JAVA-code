import java.util.Scanner;
public class Replace_elements {
    public static void main(String[]args){
        
//        Enter the String from the user and replace e with i:

       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the String: ");
       String name=sc.next();
       String result="";
       for(int i=0;i<name.length();i++){
           if(name.charAt(i)=='e'){
               result+='i';
           }else{
               result+=name.charAt(i);
           }
       }
       System.out.println("Replaced string are: "+result);
    }
}
