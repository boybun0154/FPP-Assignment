package Assignment1;

import java.util.Random;

/**
 * EMI Calculator
 * Calculates Equated Monthly Installment (EMI) for a loan with randomized inputs: principal, tenure, and annual interest rate.
 * Computes EMI, total payment, and total interest, and shows integer views of EMI.
 */
public class QuickEmiQuote {
    void main(String[] args) {
        Random random = new Random();

        int principal = random.nextInt(5000, 25000);
        int tenure = random.nextInt(6, 36);
        double annualInterestRate = Math.round((3.5 + Math.random() * (11.5 - 3.5)) * 10.0) / 10.0;
        double monthlyInterestRate = annualInterestRate/12/100;

        System.out.println("The principal amount is " + principal +".");
        System.out.println("The tenure is " + tenure +" years.");
        System.out.println("The annual Interest rate is " + annualInterestRate + "%.");
        System.out.println("The monthly interest rate is " + monthlyInterestRate+"%.");

        double emi = (principal*monthlyInterestRate*Math.pow(1+monthlyInterestRate,tenure))/(Math.pow(1+monthlyInterestRate,tenure)-1);
        double totalPayment = emi * tenure;
        double totalInterest = totalPayment - principal;

        System.out.println("The EMI amount is " + emi+".");
        System.out.println("The total payment amount is " + totalPayment+".");
        System.out.println("The total interest amount is " + totalInterest+".");


        //cast to int
        int emiWithoutCents = (int)emi;
        //rounded emi to the nearest int
        int roundedEmi = (int)Math.round(emi);

        System.out.println("The emi amoutn without cents is " + emiWithoutCents+".");
        System.out.println("The rounded emi to the nearest int is " + roundedEmi+".");

    }
}
