public class num_pyramid {
    public static void main(String[]args){
        
        int n=5;
        for(int i=1;i<=n;i++){
            for(int s=1;s<=n-i;s++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
