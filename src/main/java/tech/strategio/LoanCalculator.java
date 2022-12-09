package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     *
     * Each iteration takes 10% off the amount, saves this in a variable called remainingAmount.
     * The counter keeps track of how many times the loop occurs.
     * Once the while loop has gone 3 times, the final amount is returned.
     * However, if the starting amount is 0 to begin with, 0 is immediately returned.
     *
     * @param amount begins with the given amount,
     *               and updates after every iteration in remainingAmount variable.
     * @return the amount after three loops, taking 10% off the total amount each iteration
     *
     */
    static int getRemainingAmountIn3Months(int amount) {
        if (amount == 0) return 0;
        int counter = 0;
        int remainingAmount = amount;
        while (counter <= 2) {
            int interest = (int) (remainingAmount * .10);
            remainingAmount -= interest;
            counter++;
        }
        return remainingAmount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
