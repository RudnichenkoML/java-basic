package classesHW;

public class Cat5 {
    private static int catCount = 0;

    public static void setCatCount() {
        catCount++;
    }

    public static void main(String[] args) {
        Cat5 cat1 = new Cat5();
        Cat5.setCatCount();
        Cat5 cat2 = new Cat5();
        Cat5.setCatCount();
        Cat5 cat3 = new Cat5();
        Cat5.setCatCount();
        System.out.println("Cats counts is: " + Cat5.catCount);

    }
}
