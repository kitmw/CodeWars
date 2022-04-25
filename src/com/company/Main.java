package com.company;

public class Main {
    public static void main(String[] args) {
        Answers answers = new Answers();
        System.out.println(answers.multiply(2, 3));
        System.out.println(answers.sumOfNats(10));
        System.out.println(answers.last2CharsMatch("hello","lo"));
        System.out.println(answers.ipsBetween("10.0.0.0", "10.0.0.50"));
        System.out.println(answers.ipsBetween("20.0.0.10", "20.0.1.0"));
        System.out.println(answers.orderWeight("56 65 74 100 99 68 86 180 90"));
        System.out.println(answers.orderWeight("56657410099688618090"));

    }
}