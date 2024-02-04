package JavaProgramming.Homework.Lesson3.Task3;

/**
 * Создать метод принимающий на вход две переменные типа int.
 * Метод вычисляет их сумму и возвращает значение.
 * Вызвать этот метод из метода main.
 * Сделать методы для вычисления разницы, произведения и деления.
 */

public class Calc {

    public static int summa(int a, int b){
        int result = a + b;
        return result;
    }

    public static void main(String[] args) {

        System.out.println(summa(2,5));
    }
}
