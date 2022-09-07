package lesson6HW.encapsulation;

public class Cat3 {
    private String name;
    private int age;
     int weight;
     String color;

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    /**
     * @method setName- I set up a private modifier for closing access to update the name variable. But I guess that delete
     * this method would be better
     * @method setAge- I set up a private modifier for closing access to update the age variable. But I guess that delete
     * this method would be better
     */

    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }
}
