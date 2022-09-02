package classesHW;

public class Cat6 {
    String name = "unknown";
    int weight = 3;
    int age = 2;
    String color = "unknown";
    String address = "unknown";

    public Cat6(String name) {
        this.name = name;
    }

    public Cat6(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat6(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Cat6(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public Cat6(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }
}
