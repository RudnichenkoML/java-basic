package Lesson8HW.String;

public class StringTask {
    public static void main(String[] args) {

        String s = "Hey how are you";

//        //print the length of the string:
//        System.out.println(s.length());
//        //print the last char of the string (use the previous method to calculate the index - do not use hardcoded indexes):
//        System.out.println(s.charAt(s.length() - 1));
//        //print the index of 'a':
//        System.out.println(s.indexOf("a"));
//        //substirng the string by the second space " " - result should be "Hey how":
//        System.out.println(s.substring(0, 7));
//        //check if the string start with 'h', with 'H', end with '\':
//        System.out.println(s.startsWith("h"));
//        System.out.println(s.startsWith("H"));
        System.out.println(s.startsWith("\\"));
//        //check if the string contains "are you":
//        System.out.println(s.contains("are you"));
//        //replace "how" to "who":
//        System.out.println(s.replace("how", "who"));
//        //split the string via space " " and print each word from the new line:
//        String[] words = s.split("\s");
//        for (String w : words) {
//            System.out.println(w);
//        }
        //create the method that takes String and char parameters and return the quantity of letters that exist in that string:

        System.out.println(getCharQuantityInTheString(s, 'y'));
        greeting("Max", 32);

    }


    public static int getCharQuantityInTheString(String s, char c) {
        String trimmed = s.replaceAll(String.valueOf(c), "");
        return trimmed.length();
    }

    public static void greeting(String name, int age) {
        String s = String.format("Hey, my name is %s, and I'm %d years old", name, age);

        System.out.println(s);

    }
}
