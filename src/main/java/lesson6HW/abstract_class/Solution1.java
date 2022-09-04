package lesson6HW.abstract_class;

public class Solution1 {
    public static abstract class Animal {
        public abstract String getName();
    }


    public static class Caw extends Animal {
        public Caw(String name) {
            this.name = name;
        }

        private String name;

        @Override
        public String getName() {
            return name;
        }

        public void eat() {
            System.out.println("Om-nom-nom");
        }

        public void sleep() {
            System.out.println("Zzzzzz");
        }


        public boolean getMilk() {
            return true;
        }

    }

}
