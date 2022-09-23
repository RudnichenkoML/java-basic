package Lesson11HW.Exceptions;

public class Solution {

    public static void main(String[] args) {
        int i = -1;
        printNumber(i);
        printNumber(1);
        try {
            printNumber(i);
        } catch (IllegalArgumentException e) {
            System.err.println("Exception was caught");
        }
    }

    public static class MyException extends IllegalArgumentException {
        public MyException() {
            super("The value should be more than zero");
        }
    }

    public static void printNumber(int i){

        if (i<0){
            throw new MyException();
        }else {
            System.out.println(i);
        }

    }
}

