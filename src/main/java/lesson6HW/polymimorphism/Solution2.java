package lesson6HW.polymimorphism;

public class Solution2 {
    public static void main(String[] args) {
        Cow cow = new Whale();

        System.out.println(cow.getName());
    }

    public static class Cow {
        public String getName() {
            return "I'm cow";
        }
    }

    public static class Whale extends Cow {
        @Override
        public String getName(){
            return ""; // 2nd way: return:null but in this case null will be printed
        }

    }
}
