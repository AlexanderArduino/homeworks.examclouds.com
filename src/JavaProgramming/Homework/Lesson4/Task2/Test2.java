package JavaProgramming.Homework.Lesson4.Task2;

import java.io.Console;
import java.util.Scanner;


/**
 * Меньшее по модулю число
 * Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых пользователем вещественных чисел.
 * Для вычисления модуля используйте тернарную условную операцию.
 * Для ввода чисел используем класс Scanner.
 */
public class Test2 {

    public static double minimalNumber(double a, double b, double c) {

        double result = Math.min(Math.abs(a), Math.abs(b));
        result = Math.min(result, Math.abs(c));

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = Math.abs(sc.nextDouble());
        double b = Math.abs(sc.nextDouble());
        double c = Math.abs(sc.nextDouble());


        System.out.println("Минимальное введенное число: " + minimalNumber(a, b, c));


    }
}
