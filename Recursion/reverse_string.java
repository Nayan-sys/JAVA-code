package Recursion;

public class reverse_string {
    
   public static void stringRev(String str,int idx){
       if(idx==0){
           System.out.println(str.charAt(idx));
           return;
       }
       System.out.print(str.charAt(idx));
       stringRev(str,idx-1);
   }

   public static void main(String[]args){
    
           String str="A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
           stringRev(str,str.length()-1);
}
}
