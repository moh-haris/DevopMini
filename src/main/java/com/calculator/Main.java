package com.calculator;

import java.util.Scanner;

public class Main {
//haris
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nScientific Calculator");
            System.out.println("1. Square Root");
            System.out.println("2. Factorial");
            System.out.println("3. Natural Log ");
            System.out.println("4. Power ");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter number: ");
                    double num = sc.nextDouble();
                    System.out.println("Result: " + Math.sqrt(num));
                    break;

                case 2:
                    System.out.print("Enter integer: ");
                    int n = sc.nextInt();
                    System.out.println("Result: " + factorial(n));
                    break;

                case 3:
                    System.out.print("Enter number: ");
                    double lnNum = sc.nextDouble();
                    System.out.println("Result: " + Math.log(lnNum));
                    break;

                case 4:
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exp = sc.nextDouble();
                    System.out.println("Result: " + Math.pow(base, exp));
                    break;

                case 5:
                    System.out.println("Exiting");
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }

    public static long factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Negative not allowed");
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }
}
