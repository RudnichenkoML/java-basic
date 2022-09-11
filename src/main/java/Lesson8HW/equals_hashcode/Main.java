package Lesson8HW.equals_hashcode;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Marsik",2,3);
        Cat cat2 = new Cat("Marsik",2,3);
        Cat cat3 = new Cat("Vaska",5,8);


        System.out.println(cat1.equals(cat2));
        System.out.println(cat2.equals(cat3));
        System.out.println(cat1.toString());
        System.out.println(cat1.hashCode() == cat2.hashCode());

    }
}
