package Lesson11;

public class Exception {
    public static void main(String[] args) {
        System.out.println("Program start");

        try {
            System.out.println("Before method1 calling");
            method1();
            System.out.println("After");
        }catch (java.lang.Exception e){
            System.out.println("exception");
        }
    }

    private static void method1() {
    }
}
