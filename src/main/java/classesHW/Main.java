package classesHW;

public class Main {
    public static void main(String[] args) {
        Cat first = new Cat();
        Cat second = new Cat();
        Cat third = new Cat();
        first.setName("Maxik");
        first.setAge(8);
        first.setWeight(8);
        second.setName("Vasiya");
        second.setAge(5);
        second.setWeight(3);
        third.setName("Pups");
        third.setAge(1);
        third.setWeight(10);

        System.out.println(first.fight(second));
        System.out.println(second.fight(first));
        System.out.println(second.fight(third));
        System.out.println(third.fight(second));
        System.out.println(first.fight(third));
        System.out.println(third.fight(first));


    }
}
