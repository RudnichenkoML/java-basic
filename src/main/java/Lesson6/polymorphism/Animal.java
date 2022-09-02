package Lesson6.polymorphism;

public class Animal {
    String name;
    private String vois;

    public Animal(String name) {
        this.name = name;
    }
    public void sleep(){
        System.out.println("Zzzzzz");
    }

    public void speak(String vois){

        this.vois = vois;
        System.out.println(vois);
    }
}
