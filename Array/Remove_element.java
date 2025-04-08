public class Remove_element {
  


    public static void removeElement(int a[]){
        int k=0;
        for(int i=0;i<a.length;i++){
          if(i==0 || a[i]!=a[i-1] ){
              a[k]=a[i];
              k++;
          }
        }
          int c[]=new int[k];
          for(int i=0;i<k;i++){
              c[i]=a[i];
          }
          for(int i=0;i<k;i++){
              System.out.print(c[i]+" ");
          }
        }
    
        
    public static void main(String[] args) {
        int a[]={0, 0, 1, 1, 1, 2};
        removeElement(a);
    }
}



