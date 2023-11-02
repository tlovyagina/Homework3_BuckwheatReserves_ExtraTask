package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
      BuckwheatReservesCalculator calculator = new BuckwheatReservesCalculator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("В течение скольки месяцев Василий хочет питаться гречкой:");
        calculator.calculate(scanner.nextInt());
    }
}