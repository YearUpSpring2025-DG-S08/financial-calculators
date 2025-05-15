package com.pluralsight;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    System.out.println("Welcome to the Mortgage Calculator");

    // ask for User input for principal, interest rate, and loan length
    System.out.println("What is the loan amount you would like to take out?");
    double principalAmount = scanner.nextFloat();

    System.out.println("What is your desired interest rate for the loan?");
    double interestRate = scanner.nextFloat();

    System.out.println("What is the desired length of the loan?");
    int loanLength = scanner.nextInt();

    // calculate the expected monthly payment
    double monthlyPayment =
            principalAmount * (interestRate * Math.pow(1 + interestRate, 12 * loanLength)
                    / (Math.pow(1 + interestRate, 12 * loanLength) - 1));
    }
}