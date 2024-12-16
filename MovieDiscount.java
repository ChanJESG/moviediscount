package controlflow.moviediscount;

/*
* Class MovieDiscount takes in a user's age as input
* And depending on the age, the discount is as follows:
* Below 5 years old: 60% discount of normal ticket price of 7 euros
* Above 60 years old: 55% discount
* */

import java.util.Scanner;

public class MovieDiscount {

    public static void main(String[] args) {

        double ticketPrice = 7;

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter your age: ");

        while (scanner.nextInt() < 0 || !scanner.hasNextInt()  ) {
            System.out.println("Please input a valid age");
            scanner.next();
        }

        int age = scanner.nextInt();


        if(age >= 0 && age < 5)
            System.out.println(calcDiscount(60, ticketPrice));
        else if (age > 60)
            System.out.println(calcDiscount(55, ticketPrice));
        else if (age >= 5)
            System.out.println(calcDiscount(0, ticketPrice));

    }

    public static String calcDiscount(double discount, double price) {
        if (discount == 0)
            return "No discount available.";

        double result = price * (discount / 100);
        return String.format("Your new ticket price is %d%% of initial price ($%.2f): $%.2f", (int)discount, price, result);
    }
}
