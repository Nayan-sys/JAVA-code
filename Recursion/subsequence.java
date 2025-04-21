package Recursion;

public class subsequence {
    
    public static void subsequences(String str,int idx,String subs){
        if (idx == str.length()){
            System.out.println(subs);
            return;
        }
        char currChar=str.charAt(idx);
//        to be
        subsequences(str,idx+1,subs+currChar);
//        to not be
        subsequences(str,idx+1,subs);

    }
    public static void main(String[] args) {
        String str="abc";
        subsequences(str,0,"");

    }
}
