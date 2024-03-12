package com.corejava;
import java.util.Scanner;

public class BinaryNo {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first binary number: ");
        String binary1 = scanner.nextLine();

        System.out.print("Enter the second binary number: ");
        String binary2 = scanner.nextLine();

        String sum = addBinary(binary1, binary2);
        
        System.out.println("The sum of " + binary1 + " and " + binary2 + " is: " + sum);

        scanner.close();
    }

    public static String addBinary(String binary1, String binary2) {
        StringBuilder result = new StringBuilder();
        int carry = 0;

        int i = binary1.length() - 1;
        int j = binary2.length() - 1;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0)
                sum += binary1.charAt(i--) - '0';
            if (j >= 0)
                sum += binary2.charAt(j--) - '0';

            result.insert(0, sum % 2);
            carry = sum / 2;
        }

        if (carry > 0)
            result.insert(0, carry);

        return result.toString();
    }
}



