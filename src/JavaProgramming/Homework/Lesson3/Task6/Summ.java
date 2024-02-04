package JavaProgramming.Homework.Lesson3.Task6;

import java.util.Scanner;

import static JavaProgramming.Homework.Lesson3.Task3.Calc.*;

/**
 * Создать программу, которая будет вычислять и выводить на экран сумму двух целых чисел,
 * введённых пользователем с помощью класса Scanner.
 * Если пользователь некорректно введёт хотя бы одно из чисел, то сообщать об ошибке.
 */
public class Summ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int a = summa(sc.nextInt(), sc.nextInt());
            System.out.println(a);
        } else {
            System.out.println("Вы ввели некоректное число");
        }
        sc.close();
    }
}
