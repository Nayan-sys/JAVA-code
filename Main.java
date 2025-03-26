import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int r,evensum=0,oddsum=0;

        int i=n;
        while(n>0){
            r=n%10;
            if(r%2==0){
                evensum+=r;
            }else{
                oddsum+=r;
            }
            n=n/10;
            i++;
        }
        System.out.println("The sum of even number between the digits are: "+evensum);
        System.out.println("The sum of odd number between the digits are: "+oddsum);



    }
}