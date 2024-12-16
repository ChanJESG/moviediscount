package controlflow.moviediscount;

/*
* Class MovieDiscount takes in a user's age as input
* And depending on the age, the discount is as follows:
* Below 5 years old: 60% discount of normal ticket price of 7 euros
* Above 60 years old: 55% discount
* */

import java.util.Scanner;

public class MovieDiscount {
    public static final double childDiscount = 60.0, seniorDiscount = 55.0;

    public static void main(String[] args) {

        double ticketPrice = 7;

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter your age: ");
        int age = scanner.nextInt();


        if(age >= 0 && age < 5)
            System.out.println(calcDiscount(childDiscount, ticketPrice));
        else if (age > 60)
            System.out.println(calcDiscount(seniorDiscount, ticketPrice));
        else if (age >= 5)
            System.out.println(calcDiscount(0, ticketPrice));

    }


    /**
     * @param discount is of type double, to pass in the discount value
     * @param price is of type double, to pass in the ticket price
     * @return String value based on the computed results
     */

    public static String calcDiscount(double discount, double price) {
        if (discount == 0)
            return String.format("Your ticket price is $%.2f", price);

        double result = price * (discount / 100);
        return String.format("Your new ticket price is %.1f%% of initial price (%.2f euros): %.2f euros", discount, price, result);
    }
}
