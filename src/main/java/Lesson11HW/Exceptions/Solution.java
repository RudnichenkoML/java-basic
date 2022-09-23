package Lesson11HW.Exceptions;

public class Solution {

    public static void main(String[] args) {
        int i = -1;
        Exception.printNumber(-1);
        try {
            Exception.printNumber(i);
        } catch (IllegalArgumentException e) {
            System.err.println("Exception was caught");
        }
    }

    public static class Exception extends IllegalArgumentException {

        public static void printNumber(int number) {
            if (number < 0) {
                throw new IllegalArgumentException("The value should be more than zero");

            } else System.out.println(number);
        }
    }
}
