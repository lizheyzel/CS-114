package edu.ldsbc;



import java.util.Scanner;

public class assignment3b {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter monthly savings amount: ");
        double initAmt = sc.nextDouble();

        System.out.print("Enter yearly interest rate: ");
        double rate = sc.nextDouble();
        rate = rate / 100;
        rate = rate / 12;

        double amt = initAmt;

        amt = initAmt;
        amt = amt + (amt * rate);
        System.out.println("After 1 month amount = " + amt);

        amt = amt + initAmt;
        amt = amt + (amt * rate);
        System.out.println("After 2 months amount = " + amt);

        amt = amt + initAmt;
        amt = amt + (amt * rate);
        System.out.println("After 3 months amount = " + amt);

        amt = amt + initAmt;
        amt = amt + (amt * rate);
        System.out.println("After 4 months amount = " + amt);

        amt = amt + initAmt;
        amt = amt + (amt * rate);
        System.out.println("After 5 months amount = " + amt);

        amt = amt + initAmt;
        amt = amt + (amt * rate);
        System.out.println("After 6 months amount = " + amt);

    }
}
