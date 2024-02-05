package JavaProgramming.Homework.Lesson5.Task2;

import java.util.Scanner;

/**
 * 2. Число от 0 до 10.
 * С помощью класса Scanner ввести целое число.
 * Если это число от 0 до 10, вывести на консоль сообщение “Положительное число меньше 10 или ноль”, иначе вывести сообщение “Положительное число больше 10 или отрицательное”.
 * Используем оператор if-else.
 */
public class Test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num >= 0 & num < 10) {
            System.out.println("Положительное число меньеш 10 или 0");
        } else {
            System.out.println("Положительное число больше 10 или отрициательное");
        }
    }
}
