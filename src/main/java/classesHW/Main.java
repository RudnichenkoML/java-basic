package classesHW;

public class Main {
    public static void main(String[] args) {
                Cat first = new Cat("Maxik",8,6);
               Cat second = new Cat("Vasia",3,2);
        System.out.println(first.fight(second));
        System.out.println(second.fight(first));


    }
}
