import java.util.Scanner;
public class Merge {
    public static void main(String[]args){
        // int a[5]={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
        int i;int j;int k;
        int a[]=new int[5];
        System.out.println("Enter the elements of first array:");
        for(i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int b[]=new int[5];
        System.out.println("Enter the elements of second array:");
        for(j=0;j<b.length;j++){
            b[j]=sc.nextInt();
        }
        int c[]=new int[10];
        i=0;j=0;k=0;
        
        while(i<5 && j<5){
            if(a[i]<=b[j]){
                c[k]=a[i];
                i++;
                k++;
              

            }else{
                c[k]=b[j];
                j++;
                k++;
            }
        
        }
        while(i<5){
            c[k]=a[i];
            
            i++;
            k++;
        }
        while(j<5){
            c[k]=b[j];
            
            j++;
            k++;
        }
         System.out.println("Array after merge:");
        for (int num : c) {
            System.out.print(num + " ");
        }
        
    }
}