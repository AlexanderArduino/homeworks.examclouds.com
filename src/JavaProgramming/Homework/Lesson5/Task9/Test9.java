package JavaProgramming.Homework.Lesson5.Task9;

import javax.swing.*;

/**
 * 9. Факториал.
 * Реализовать подсчет факториала используя цикл for. Пример вычисления факториала:
 *
 * n! = 1*2*...*n;
 * 0! = 1;
 * 5! = 1*2*3*4*5;
 * Число n задается случайным образом (используйте Math.random()). Оно должно быть в диапазоне от 0 до 5.
 */

public class Test9 {

    public static int factorial(){
        double rand = Math.random()*100/10/2;
        System.out.println("Random: " + rand);
        int res = (int) rand;
        System.out.print("Res: " + res);
        int fact = 1;
//        for (int i = 0; i < rand; i++) {
//            fact = fact * (fact+1);
//        }
//        System.out.println(fact);
        return fact;
    }
}

class Test{
    public static void main(String[] args) {
            Test9.factorial();
    }
}
