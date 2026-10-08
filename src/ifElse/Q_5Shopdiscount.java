package ifElse;

import java.util.Scanner;

public class Q_5Shopdiscount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the amount");
        double amount = sc.nextDouble();

        double discount = 0;

        if (amount >= 5000) {
            discount = amount * 0.20;  // 20% discount
        } else if (amount >= 2000) {
            discount = amount * 0.10;  // 10% discount
        } else if (amount >= 500) {
            discount = amount * 0.05;  // 5% discount
        } else {
            discount = 0;              // No discount
        }

        double finalAmount = amount - discount;

        System.out.println("Amount " + amount);
        System.out.println("The discount is " + discount);
        System.out.println("The final Amount is " + finalAmount);



    }
}
