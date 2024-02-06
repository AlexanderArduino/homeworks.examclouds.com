package JavaProgramming.Homework.Lesson5.Task4;

import java.util.Scanner;

/**
 * 4. Дни недели с оператором switch.
 * Переписать задание "3. Дни недели" используя оператор switch.
 */
public class Test4 {

    public static void dauOfWeek(int day) {
        switch(day){
            case 1:
                System.out.println("Понедельник"); break;
            case 2:
                System.out.println("Вторник"); break;
            case 3:
                System.out.println("Среда"); break;
            case 4:
                System.out.println("Четверг"); break;
            case 5:
                System.out.println("Пятница"); break;
            case 6:
                System.out.println("Суббота"); break;
            case 7:
                System.out.println("Воскресенье"); break;
            default:
                System.out.println("Вы ввели не корректный день недели");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dauOfWeek(sc.nextInt());
    }
}
