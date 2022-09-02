package Lesson_5;

import java.util.Arrays;

public class test extends Lesson5{
    public static void main(String[] args) {
        int[]arr = new int[5];
        arr(arr);

            }
    void print(){
        System.out.println(name);
    }

    private static void arr(int[] arr){
        for (int i = 0; i<arr.length; i++){
            arr[i] = i+1;
        }
    }
    private static void sort(int[]y){
        Arrays.stream(y).sorted();
    }

}
