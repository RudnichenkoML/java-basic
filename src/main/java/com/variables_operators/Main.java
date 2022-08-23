package com.variables_operators;

public class Main {


    public static void main(String[] args) {

        printMessage("Hi! my name is Max");
        printSum(2, 9);
        System.out.println(multiply(2, 4));


    }

    public static void printMessage(String string) {

        System.out.println(string);
    }

    public static void printSum(int a, int b) {
        System.out.println(a + "+" + b + " = " + (a + b));
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

}

