package Sorting;

public class Bubble_sort {
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        

            //        Bubble sort:
            
                   int arr[]={8,4,9,2,6,0};
                   for(int i=0;i<arr.length-1;i++){
                       for(int j=0;j<arr.length-i-1;j++){
                           if(arr[j]>arr[j+1]){
                               int temp=arr[j];
                               arr[j]=arr[j+1];
                               arr[j+1]=temp;
                           }
                       }
                   }
                   bubbleSort(arr);
    }
}
