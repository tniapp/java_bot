package numbers;

import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        welcomeUser();
        instruction();

        System.out.print("Enter a request: > ");
        long number = scanner.nextLong();
        System.out.println();

        checkCondition(number);
    }

    public static void welcomeUser() {
        System.out.println("Welcome to Amazing Numbers!");
        System.out.println();
    }

    public static void instruction() {
        System.out.println("Supported requests:");
        System.out.println("- enter a natural number to know its properties;");
        System.out.println("- enter 0 to exit.");
        System.out.println();
    }

    public static void exit() {
        System.out.println("Goodbye!");
    }

    public static void checkCondition(long number) {
        while (true) {
            if (number < 0) {
                System.out.println("The first parameter should be a natural number or zero.");
                System.out.println();
                System.out.print("Enter a request: > ");
                number = scanner.nextLong();
                System.out.println();
            } else if (number == 0) {
                exit();
                break;
            } else {
                System.out.println("Properties of " + number);
                evenOrOdd(number);
                ifBuzz(number);
                ifDuck(number);
                ifPalindromic(number);
                System.out.println();

                System.out.print("Enter a request: > ");
                number = scanner.nextLong();
                System.out.println();
            }
        }
    }

    public static void ifPalindromic(long value) {
        String valueStr = Long.toString(value);
        String reverseValueStr = "";

        for(int i = valueStr.length(); i > 0; i--) {
            reverseValueStr += valueStr.substring(i-1, i);
        }

        if (reverseValueStr.equals(valueStr)) {
            System.out.println(" palindromic: true");
        } else {
            System.out.println(" palindromic: false");
        }
    }

    public static void evenOrOdd(long value) {
        if (value % 2 == 0) {
            System.out.println("        even: true");
            System.out.println("        odd: false");
        } else {
            System.out.println("        even: false");
            System.out.println("        odd: true");
        }
    }

    public static void ifBuzz(long value) {
        if (value % 10 == 7 || value % 7 == 0) {
            System.out.println("        buzz: true");
        } else {
            System.out.println("        buzz: false");
        }
    }

    public static void ifDuck(long value) {
        String valueStr = Long.toString(value);
        String valueSubstr = valueStr.substring(1);

        if (valueSubstr.contains("0")) {
            System.out.println("        duck: true");
        } else {
            System.out.println("        duck: false");
        }
    }
}
