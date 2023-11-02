package org.example;

public class BuckwheatReservesCalculator {
    public void calculate (int months) {
        int summ = 0;
        int monthAppetite = 6;
        int monthPrice = 100;

        for (int i = 0; i < months; i++) {
            summ = summ + monthPrice * monthAppetite * (months - i);
        }
        System.out.println("Василию нужно денег на хранение гречки: " + summ);
    }
}