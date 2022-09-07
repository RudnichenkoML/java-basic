package lesson6HW.interfaces;

public class Solution4 {
    public abstract class Human implements Run, Swim {
        @Override
        public void start() {

        }

        @Override
        public void finish() {

        }

        @Override
        public void dive() {

        }

        @Override
        public void resurface() {

        }
    }

    interface Run {
        void start();

        void finish();
    }

    interface Swim {
        void dive();

        void resurface();
    }


}
