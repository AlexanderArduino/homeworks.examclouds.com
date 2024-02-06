package JavaProgramming.Homework.Lesson4.Task3;


/**
 * Гирлянда, часть 1
 * Имеется гирлянда, состоящая из 32 лампочек. Каждая лампочка имеет два состояния - включена или выключена.
 * В начале работы программы случайным образом задайте какие лампочки будут включены. Напишите следующие методы:
 * <p>
 * метод blink, который будет мигать лампочками гирлянды один раз (операция ~);
 * метод run, который будет запускать гирлянду в режим бегущей строки (операция << или >>);
 * метод isFirstLampOn, который будет выяснять включена ли лампочка в первой позиции (наложение маски с помощью &);
 * метод, который будет распечатывать текущее состояние гирлянды. Для получения двоичного формата числа используйте метод Integer.toBinaryString(a).
 * Используйте побитовые операции.
 */
public class Girlyanda {

    /**
     * Выводит в консоль состояние битов числа
     * @param lamp - число.
     */
    public static void serialOutLamp(int lamp){
        System.out.println(Integer.toBinaryString(lamp));
    }


    /**
     * Инвертирует все 32 знака числа один раз
     *
     * @param lamp - число для инвертирования
     * @return - возвращает после инвертирования
     */
    public static int blink(int lamp) {
        return ~lamp;
    }


    /**
     * Инвертирует все 32 знака числа n-раз
     *
     * @param lamp  - число для инвертирования
     * @param count - количество n-раз для инвертирования
     * @return - возвращает после инвертирования
     */
    public static int blink(int lamp, int count) {
        for (int i = 0; i < count; i++) {
            lamp = ~lamp;
        }
        return lamp;
    }

    /**
     * Сдвигает число налево 1 раз
     * @param lamp  - число для сдвига
     * @return - возвращает после сдвига
     */
    public static int runLeft(int lamp) {
        return runLeft(lamp, 1);
    }

    /**
     * Сдвигает число направо 1 раз
     * @param lamp  - число для сдвига
     * @return - возвращает после сдвига
     */
    public static int runRight(int lamp) {
        return runRight(lamp, 1);
    }

    /**
     * Сдвигает число налево n-раз. Младшие биты заполняются нулями.
     * @param lamp  - число для сдвига
     * @param count - количество n-раз для сдвига
     * @return - возвращает после сдвига
     */
    public static int runLeft(int lamp, int count) {
        return lamp << count;
    }

    /**
     * Сдвигает число направо n-раз. Старшие биты заполняются нулями.
     * @param lamp  - число для сдвига
     * @param count - количество n-раз для сдвига
     * @return - возвращает после сдвига
     */
    public static int runRight(int lamp, int count) {
        return lamp >>> count;
    }

    /**
     * Выясняет, является ли первый бит числа единицей. Через функции runLeft() и runRight();
     * @param lamp  - число для проверки
     * @return   true - является, false - не является
     */
    public static boolean isFirstLampOn(int lamp) {
        lamp = runLeft(lamp, 31);
        lamp = runRight(lamp, 31);
        if (lamp == 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Выясняет, является ли первый бит числа единицей. Через операцию "&"
     * @param lamp  - число для проверки
     * @return   true - является, false - не является
     */
    public static boolean isFirstLampOn2(int lamp) {
        lamp = lamp & 1;
        if (lamp == 1) {
            return true;
        } else {
            return false;
        }
    }

}

class Test {
    public static void main(String[] args) {
        int lamp = 0b0000_0000_0000_0000_0000_0000_0000_0011;
        int count = 31;
        System.out.println(Girlyanda.isFirstLampOn2(lamp));

/*
        System.out.println(Integer.toBinaryString(lamp));
        lamp = Girlyanda.runLeft(lamp,31);
        System.out.println(Integer.toBinaryString(lamp));
        lamp = Girlyanda.runRight(lamp,31);
        System.out.println(Integer.toBinaryString(lamp));
*/


        /*
        System.out.println(Integer.toBinaryString(Girlyanda.blink(lamp, count)));
        System.out.println(Integer.toBinaryString(Girlyanda.blink(lamp)));
        System.out.println("");
        System.out.println(Integer.toBinaryString(Girlyanda.runLeft(lamp)));
        System.out.println(Integer.toBinaryString(Girlyanda.runLeft(lamp,count)));
        System.out.println("");
        System.out.println(Integer.toBinaryString(Girlyanda.runRight(lamp)));
        System.out.println(Integer.toBinaryString(Girlyanda.runRight(lamp, count)));
        */


    }

}
