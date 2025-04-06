package Sorting;

public class Insertion_sort {
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
//        Insertion sort:

       int arr[]={7,9,4,5,7,2,4};
       for(int i=1;i<arr.length;i++){
           int current=arr[i];
           int j=i-1;
           while(j>=0 && current<arr[j]){
               arr[j+1]=arr[j];
               j--;
           }
           arr[j+1]=current;
       }
       bubbleSort(arr);
    }
}
