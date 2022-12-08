package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * TODO: finish out this JavaDoc comment block.
     * FIXME: WHAT DOES THIS METHOD DO?
     *
     * Each iteration takes 10% off the amount, (or 90% of the amount),
     * Once the while loop has gone through 3 times, the final amount is returned.
     *
     * @param ???
     * @return ???
     */
    static int getRemainingAmountIn3Months(int amount) {
        int counter = 0;
        int finalAmount = amount;

        if (amount == 0) return 0;
        while (counter <= 2) {
            finalAmount *= .9;
            counter++;
        }

        return finalAmount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
