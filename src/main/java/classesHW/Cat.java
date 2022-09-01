package classesHW;

public class Cat {
    private String name;
    private int age;
    private int weight;
    private int strength = 0;

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




    public boolean fight(Cat anotherCat) {
        boolean winner;
        if (age > anotherCat.age && weight > anotherCat.weight) {
            strength++;
        } else if (age < anotherCat.age && weight < anotherCat.weight) {
            anotherCat.strength++;
        } else if (age > anotherCat.age && weight < anotherCat.weight) {
            anotherCat.strength++;
        } else if (age < anotherCat.age && weight > anotherCat.weight) {
            strength++;
        } else if (age == anotherCat.age && weight == anotherCat.weight) {
            System.out.println("Cat's strength is the same. Let's be friends!");
        } else {
            System.out.println("Something went wrong with these cats :(");
        }

        if (strength > anotherCat.strength) {
            winner = true;
        } else if (strength < anotherCat.strength) {
            winner = false;
        } else {
            System.out.println("Friendship won? ");
            return true;
        }


        return winner;

    }


}
