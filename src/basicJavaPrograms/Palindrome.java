package basicJavaPrograms;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        System.out.println("Enter a number to check if it is a palindrome");
        Scanner sc = new Scanner(System.in);
        int check = sc.nextInt();
        int temp = check;
        int rev = 0;
        while (check != 0) {
            int c = check % 10;
            rev = rev * 10 + c;
            check = check / 10;
        }
        if (temp == rev) {
            System.out.println("palindrome Number");
        }
    }
}
