package Lesson6.inheritance;

public class Cat extends Pet{

    public Cat(String name) {
        super(name);
    }
    public void eat(){
        System.out.println("Om-nom-nom");
    }
}
