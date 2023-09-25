package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FreelancerTest {

    @Test

    public void testCalculate1() {
        Freelancer freelancer = new Freelancer();


        int income;
        int expenses;
        int threshold;
        int actual = freelancer.calculate(income = 10_000, expenses = 3_000, threshold = 20_000);
        int expected = 12;



        Assertions.assertEquals(expected, actual);
    }
    @Test

    public void testCalculate2() {
        Freelancer freelancer = new Freelancer();

        int income;
        int expenses;
        int threshold;
        int actual = freelancer.calculate(income = 100_000, expenses = 60_000, threshold = 150_000);
        int expected = 12;


        Assertions.assertEquals(expected, actual);
    }

}