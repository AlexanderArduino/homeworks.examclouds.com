package JavaProgramming.Homework.Lesson6.Task3;

import java.util.Arrays;

/**
 * 3. Двумерный массив типа String.
 * Создать массив типа String размером 3х6.
 * И записать в него значения:
 * a1  a2  a3  a4  a5  a6
 * b1  b2  b3  b4  b5  b6
 * c1  c2   c3  c4  c5  c6
 * Распечатать массив.
 */
public class Task3 {

    public static void main(String[] args) {
        String[][] massive1 = {{"a1","a2","a3","a4","a5"},{"b1","b2","b3","b4","b5"},{"c1","c2","c3","c4","c5"}};

        String[] a = {"a1","a2","a3","a4","a5"};
        String[] b = {"b1","b2","b3","b4","b5"};
        String[] c = {"c1","c2","c3","c4","c5"};

        String[][] massive2 = {a,b,c};

        for(String[] ex : massive1){
            System.out.println(Arrays.toString(ex));
        }
        System.out.println(" ");
        for(String[] ex2 : massive2){
            System.out.println(Arrays.toString(ex2));
        }

    }
}
