package classesHW;

import org.jetbrains.annotations.NotNull;

public class Cat {
    private String name;
    private int age;
    private int weight;
    private int strength = 0;


    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        getStrengthByWeight(weight);
        getStrengthByAge(age);
    }


    public int getStrength() {
        return strength;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private void getStrengthByAge(int age) {

        if (age < 1) {
            strength += 1;
        } else if (age >= 1 && age <= 3) {
            strength += 2;
        } else if (age > 3 && age <= 5) {
            strength += 3;
        } else if (age > 5 && age <= 10) {
            strength += 4;
        } else {
            strength = 0;
        }

    }

    private void getStrengthByWeight(int weight) {

        if (weight < 1) {
            strength += 1;
        } else if (weight >= 1 && weight <= 3) {
            strength += 2;
        } else if (weight > 3 && weight <= 5) {
            strength += 3;
        } else if (weight > 5 && weight <= 10) {
            strength += 4;
        } else {
            strength = 0;
        }


    }


    public boolean fight(@NotNull Cat anotherCat) {
        boolean winner;


        if (strength > anotherCat.getStrength()) {
            winner = true;
        } else if (strength < anotherCat.getStrength()) {
            winner = false;
        } else {
            System.out.println("Friendship won? ");
            return true;
        }


        return winner;

    }


}
