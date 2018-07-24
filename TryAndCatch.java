/*
 * @Author- Alex Grullon
 * @Date- 7-23-18
 * @Version- 1
 * @Description- Small program to test out Try and Catch exceptions
 * */

import java.util.Scanner;

public class TryAndCatch {
    public static void main(String[] args) {
        double salary = 40000.0, totalSales, additionalCompensation, finalCompensation,
                fixedPercentage = .15;
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter Employee Total Sales for the year");
            totalSales = in.nextDouble();
            System.out.println();
            additionalCompensation = totalSales * fixedPercentage;
            System.out.printf("Based on the total sale of $" + totalSales +
                            ", the additional compensation is $%.2f "
                    , additionalCompensation);
            finalCompensation = salary + additionalCompensation;
            System.out.println("\n" + "The employee's final compensation is $" + finalCompensation + "\n");

        } catch (Exception e) {
            System.out.println("Input must be a number");
        }
    }
}

