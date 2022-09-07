package lesson6HW.interfaces;

public class Solution3 {


    interface Fly {
        void fly();
    }

    interface Move {
        void move();
    }

    interface Eat {
        void eat();
    }


    public class Dog implements Eat, Move {


        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public class Car implements Move {

        @Override
        public void move() {

        }
    }

    public class Duck implements Fly, Eat {

        @Override
        public void fly() {

        }

        @Override
        public void eat() {

        }
    }

    public class Airplane implements Fly, Move {
        // Interface Move for enter the runway
        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }
    }

}
