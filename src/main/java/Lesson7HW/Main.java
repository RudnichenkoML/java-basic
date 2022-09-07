package Lesson7HW;

public class Main {
    public static void main(String[] args) {
        Car sportCar = new SportCar(new SportEngine());
        sportCar.setEngine();
        System.out.println();
        Car taxiCar = new TaxiCar(new TaxiEngine());
        taxiCar.setEngine();
    }

}
