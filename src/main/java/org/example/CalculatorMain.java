package org.example;

import java.util.Scanner;
import java.util.logging.Logger;
public class CalculatorMain {
    public  void calculatormain() {
        Logger l = Logger.getLogger("com.api.jar");
        l.info("Simple Calculator");
        Scanner sc = new Scanner(System.in);
        l.info("Enter first number: ");
        double num1 = sc.nextDouble();
        l.info("Enter second number: ");
        double num2 = sc.nextDouble();
        while (true) {
            l.info("\n choose a option");
            l.info("choose the options to perform operations ");
            l.info("Enter 1 for addition");
            l.info("Enter 2 for subtraction");
            l.info("Enter 3 for multiplication");
            l.info("Enter 4 for division");
            l.info("Enter 0 to exit");
            int choice = sc.nextInt();
            Calculator c = null;
            switch (choice) {
                case 1:
                    c = new Addition();
                    break;
                case 2:
                    c = new Subtraction();
                    break;
                case 3:
                    c = new Multiplication();
                    break;
                case 4:
                    c = new Division();
                    break;
                default:
                    System.exit(0);
                    l.info("Invalid choice");
                    System.exit(0);
            }
            c.setNum1(num1);
            c.setNum2(num2);
            String z = "Result: " + c.calculate();
            l.info(z);
        }
    }

}