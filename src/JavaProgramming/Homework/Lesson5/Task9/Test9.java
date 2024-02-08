package JavaProgramming.Homework.Lesson5.Task9;

/**
 * 9. Факториал.
 * Реализовать подсчет факториала используя цикл for. Пример вычисления факториала:
 * <p>
 * n! = 1*2*...*n;
 * 0! = 1;
 * 5! = 1*2*3*4*5;
 * Число n задается случайным образом (используйте Math.random()). Оно должно быть в диапазоне от 0 до 5.
 */

public class Test9 {

    public static int factorial() {
        double rand = 0;
        for (int i = 0; i < 6; i++) {
            rand += Math.random();
        }
        int res = (int) rand;
        int fact = 1;

        if (res != 0) {
            for (int i = 1; i < res + 1; i++) {
                fact = fact * i;
            }
        }
        return fact;
    }
}

class Test {

    public static void main(String[] args) {
        for (int i = 0; i < 1_000; i++) {
            System.out.println(Test9.factorial());        }
    }

}
