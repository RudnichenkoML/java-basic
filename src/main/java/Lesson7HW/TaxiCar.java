package Lesson7HW;

public class TaxiCar extends Car {
    public TaxiCar(Engine engine) {
        super(engine);
    }

    @Override
    public void setEngine() {
        System.out.println("TaxiCar engine: ");
        TaxiEngine taxiEngine = new TaxiEngine();
        engine.setEngine();
    }
}
