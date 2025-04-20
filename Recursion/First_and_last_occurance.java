package Recursion;

public class First_and_last_occurance {
    
   public static int first=-1;
   public static int last=-1;
   public static void findOccurrence(String str,int idx,char element){
       if(idx==str.length()){
           System.out.println("First occurrence of the element in string at index: "+first);
           System.out.println("Last occurrence of the element in string at index: "+last);
           return;
       }

       if(str.charAt(idx)==element){
           if(first==-1){
               first=idx;
//                System.out.println("First occurrence of the element is at "+);
           }else{
               last=idx;
           }
       }
       findOccurrence(str,idx+1,element);
   }

   public static void main(String[]args){

  String str="afiffdggbvdsnhqhmghvxmcgkfppdsvnfg";
  findOccurrence(str,0,'g');
}
}
