public class Hollow_Butterfly {
    public static void main(String[]args){
        
        int n=10;
        int i;
//        fop outer line
        for( i=1;i<=n;i++) {
//        for hollow triangle
            for (int j = 1; j<=n;j++) {
                if (j==1 || i==j || j==n || i+j==n+1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
