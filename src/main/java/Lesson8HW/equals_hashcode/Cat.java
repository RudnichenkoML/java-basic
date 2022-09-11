package Lesson8HW.equals_hashcode;

import java.util.Objects;

public class Cat {
    private String name;
    private int age;
    private int weight;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat cat)) return false;
        return age == cat.age && name.equals(cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Cat " +
                "name: " + name  +
                ", age: " + age +
                ", weight: " + weight;
    }

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;


    }
}
