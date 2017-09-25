package edu.ldsbc;

/*
@auth Alex Martineau, Lizheyzel Carranza
Assignment 3a
@date 9/25/2017
 */

import java.util.Scanner;

public class assignment3a {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double pi = Math.PI;

        System.out.print("Enter Cylinder Radius: ");
        double r = sc.nextDouble();

        System.out.print("Enter Cylinder Length: ");
        double l = sc.nextDouble();

        double area = r * r * pi;
        System.out.println("Area = " + area);

        double vol = area * l;
        System.out.println("Volume = " + vol);

    }
}
