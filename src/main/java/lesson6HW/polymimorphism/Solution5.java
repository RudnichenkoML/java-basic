package lesson6HW.polymimorphism;

public class Solution5 {

    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {

        if (o instanceof Animal) {
            return o.getClass().getSimpleName();
        } else return "Unknown animal";
    }


    public static abstract class Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Dog extends Animal {
    }

    public static class Whale extends Animal {
    }

    public static class Pig {
    }
}

