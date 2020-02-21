package basicJavaPrograms;

import java.util.Scanner;

public class FibanocciSeries {
    public static void main(String[] args) {
        int i = 0, j = 1, a = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number untill which you need to get the fibanocci series");
        a = sc.nextInt();
        System.out.print(i + " " + j + " ");
        for (int n = 0; n < a - 2; n++) {
            int temp = i + j;
            System.out.print(temp+ " ");
            i = j;
            j = temp;
        }
    }
}
