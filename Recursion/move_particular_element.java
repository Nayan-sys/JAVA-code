package Recursion;

public class move_particular_element {

    
    public static void moveParticularElement(String str,int idx,String newString,int count){
        if(idx==str.length()){
            for(int i=0;i<count;i++){
                newString+='x';//Here x represent the particular element u want to put in last
            }
            System.out.println(newString);
            return;
        }
//         char currentChar=str.charAt(idx);
        if(str.charAt(idx)=='x'){
            count++;
            moveParticularElement(str,idx+1,newString,count);
        }else{
            newString+=str.charAt(idx);
            moveParticularElement(str,idx+1,newString,count);
        }

    }
    
    public static void main(String[]args){
 
               String str="axbcxxd";
               moveParticularElement(str,0," ",0);


}
}
