import java.util.Scanner;
public class Butterfly {
    public static void main(String[]args) {

        //        Problem 1!
        //
             Scanner sc=new Scanner(System.in);
             System.out.println("Enter the number!");
             int n=sc.nextInt();
        //        int n=4;
        
             for(int i=1;i<=n;i++){
        
             //         Upper half
        
        //         First Part
        
                 for(int j=1;j<=i;j++){
                     System.out.print("*");
                 }
        
        //         Spaces
        
                 for(int j=1;j<=2*(n-i);j++){
                     System.out.print(" ");
                 }
        
        //         Second part
        
                 for(int j=1;j<=i;j++){
                     System.out.print("*");
                 }
                 System.out.println();
             }
        
        //     Lower half
        
                for(int i=n;i!=0;i--){
        
        //         First Part
        
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
        
        //         Spaces
        
                    for(int j=1;j<=2*(n-i);j++){
                        System.out.print(" ");
                    }
        
        //         Second part
        
                    for(int j=1;j<=i;j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
}
}
