package ru.netology.services;

public class Freelancer {
    public int calculate(int income, int expenses, int threshold) {
        income = 0;
        expenses = 0;
        threshold = 0;

        int money = 0;
        int relaxMonths = 0;

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money -= expenses;
                money /= 3;
                relaxMonths++;


            } else {
                money += income;
                money -= expenses;

            }
        }
        return relaxMonths;


    }


}
