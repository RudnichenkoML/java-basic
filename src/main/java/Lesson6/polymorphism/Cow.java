package Lesson6.polymorphism;

public class Cow extends Animal {
    private String vois = "Muuuuu";

    public String getVois() {
        return vois;
    }

    public Cow(String name) {
        super(name);
    }

    @Override
    public void sleep() {
        super.sleep();
        System.out.println("Wake me up");
    }

    @Override
    public void speak(String vois) {
        System.out.println(vois);
    }
}
