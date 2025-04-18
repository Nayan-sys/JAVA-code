import java.util.Arrays;

public class h_index {
   
        public static void hIndex(int[] citations) {
            int n=citations.length;
            Arrays.sort(citations);
            for(int i=0;i<n;i++){
                int h = n - i;
                if(citations[i] >= h){
                    System.out.println(h);
                    return;
                }
            }
            System.out.println(0);
        }
    
    public static void main(String[]args){
        int citations[]={3,0,6,1,5};
        hIndex(citations);
    }
}