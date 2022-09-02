package WhileLoop;

import static Lesson_5.Lesson5.PUBLIC_MODIFIER;


public class MultiplicationTableHW {
    public static void main(String[] args) {
        int h=1;
        while(h<=10){
            int w=1;
            while(w<=10){
                System.out.print(h*w+" \t");
                w++;
            }
            h++;
            System.out.println();
        }
        System.out.println(PUBLIC_MODIFIER);

    }

}
