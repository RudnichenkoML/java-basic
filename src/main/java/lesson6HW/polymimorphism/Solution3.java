package lesson6HW.polymimorphism;

public class Solution3 {
    public static void main(String[] args) {
        Pet pet1 = new Cat();
        Pet cat = pet1.getChild();

        Pet pet2 = new Dog();
        Pet dog = pet2.getChild();
    }

    public static class Pet {
        public Pet getChild() {
            return new Pet();
        }
    }

    public static class Cat extends Pet {
        @Override
        public Pet getChild() {
            System.out.println("I'm cat");
            return new Cat();

        }
    }

    public static class Dog extends Pet {
        @Override
        public Pet getChild() {
            System.out.println("I'm dog");
            return new Dog();
        }
    }
}
