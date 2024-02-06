package JavaProgramming.Homework.Lesson5.Task8;

import JavaProgramming.Homework.Lesson4.Task3.Girlyanda;
import jdk.dynalink.linker.GuardedInvocationTransformer;

import java.util.Scanner;

/**
 * 8. Гирлянда, часть 2.
 * Переписать гирлянду (Гирлянда, часть 1) добавив следующий функционал:
 * <p>
 * Помощью класса Scanner введите число от 1 до 4.
 * Если введено число 1 - выполните метод мигания, 2 - проверку первой лампочки, 3 - метод бегущей строки, 4 - вывод состояния гирлянды на консоль.
 * Для выбора режима используйте оператор switch.
 * Измените метод мигания: метод должен мигнуть гирляндой 10 раз. Используем оператор for.
 * Измените метод бегущей строки: метод должен выполнить операцию 10 раз. Используем оператор for.
 */
public class Test8 {

    public static void main(String[] args) {
        int lamp = 0b0000_1000_0000_0100_0000_0010_0000_0001;

        Scanner sc = new Scanner(System.in);
        System.out.println("Switch on");
        switch (sc.nextInt()) {
            case 1:
                Girlyanda.serialOutLamp(Girlyanda.blink(lamp, 10));
                break;
            case 2:
                System.out.println(Girlyanda.isFirstLampOn2(lamp));
                break;
            case 3:
                Girlyanda.serialOutLamp(Girlyanda.runRight(lamp, 10));
                break;
            case 4: Girlyanda.serialOutLamp(Girlyanda.runLeft(lamp, 10)); break;
            case 5:
                Girlyanda.serialOutLamp(lamp);
                break;
            default:
                System.out.println("Вы ввели не верное число." + "\n" + "Перезапустите программу!");
        }
        System.out.println("Switch off");
        System.out.println("End programm");
    }

}
