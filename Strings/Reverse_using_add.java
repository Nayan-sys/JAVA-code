import java.util.Scanner;

public class Reverse_using_add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        System.out.println("String after reverse is: " + reverse);
        sc.close();
    }
}
