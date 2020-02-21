package basicJavaPrograms;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number to test if it is an Armstrong Number");
        int testNumber = scanner.nextInt();
        int tempTestNumber = testNumber;
        int temp = 0;
        double sum = 0;
        while (testNumber != 0) {
            temp =  testNumber % 10;
            sum = sum + Math.pow(temp, 3);
            testNumber = testNumber / 10;
        }
        if (tempTestNumber == sum) {
            System.out.println("the given Number is an Armstrong number");
        }
    }
}
