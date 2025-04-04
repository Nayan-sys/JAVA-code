import java.util.Scanner;
class Missing_term{
      
//    Find the missing number in the array!
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int size=sc.nextInt();
        int sum=0;
        int act_sum=size*(size+1)/2;
        int arr[]=new int[size];
        System.out.println("Enter the elements of an array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
//       logic for missing number
        for(int i=0;i< arr.length;i++){ 
            sum+=arr[i];
        }
        int total_sum=act_sum-sum;
        System.out.print("Missing number is: "+total_sum);
    }
}