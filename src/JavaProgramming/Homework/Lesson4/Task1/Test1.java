package JavaProgramming.Homework.Lesson4.Task1;


import java.util.Scanner;

/**
 * Проверка четности числа
 * Создать программу, которая будет сообщать, является ли целое число, введённое пользователем, чётным или нет.
 * Ввод числа осуществлять с помощью класса Scanner.
 * Если пользователь введёт не целое число, то сообщать ему об ошибке.
 */


public class Test1 {
/*
* Данная программа не может обработать исключения, возникающие при вводе НЕ ЧИСЛА или ЧИСЛА С НЕ ПРАВИЛЬНЫМ
* РАЗДЕЛИТЕЛЕМ
* Пример: Поставлен язык АНГЛИЙСКИЙ. ЧИСЛО 0,5 является вещестенным числом, а вот 0.5 уже строкой
* */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numberIn = 0;
        if(sc.hasNext()){
            numberIn = sc.nextDouble();
        }
        if(numberIn % 1 != 0){
            System.out.println("Input not integer number!!!");
        } else if(numberIn >= 0){
            System.out.println("Input pozitiv number");
        } else if(numberIn < 0){
            System.out.println("Input negativ number");
        }
    }
}
