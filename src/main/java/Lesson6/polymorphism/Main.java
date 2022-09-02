package Lesson6.polymorphism;

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("Burenka");
        cow.sleep();
        cow.speak(cow.getVois());
        Pat pat = new Pat("test");
        pat.sleep();



    }


}
