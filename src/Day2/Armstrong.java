package Day2;

import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int og = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }

        if (sum == og) {
            System.out.println(og + " is an Armstrong number.");
        } else {
            System.out.println(og + " is not an Armstrong number.");
        }

        s.close(); // Close the scanner here
    }
}
