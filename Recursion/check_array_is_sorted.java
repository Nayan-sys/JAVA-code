package Recursion;

public class check_array_is_sorted {
    
   public static boolean isSorted(int arr[],int idx){
       if(idx==arr.length-1){
           System.out.println("Array is sorted!");
           return true;
       }

       if(arr[idx]<arr[idx+1]){
          return isSorted(arr,idx+1);
       }else{
           System.out.println("Array is not sorted!");
           return false;
       }
   }

   public static void main(String[]args){

           int arr[]={1,2,5,5,5};
           isSorted(arr,0);
}
}
