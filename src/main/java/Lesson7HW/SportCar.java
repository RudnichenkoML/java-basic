package Lesson7HW;

public class SportCar extends Car{
    public SportCar(Engine engine) {
        super(engine);
    }

    @Override
    public void setEngine() {
        System.out.println("SportCar engine: ");
        engine.setEngine();




    }
}
