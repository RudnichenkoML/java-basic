package lesson6HW.abstract_class;

public class Solution2 {

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        String name;

        @Override
        public String getName() {
            return name;
        }

        @Override
        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {
        String name;

        @Override
        public String getName() {
            return name;
        }

        @Override
        public Pet getChild() {
            return new Dog();


        }
    }
}

