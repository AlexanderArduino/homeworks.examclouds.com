package JavaProgramming.Homework.Lesson12.Task3;

import java.util.ArrayList;

/**
 * 3. Одежда
 * Создать перечисление, содержащее размеры одежды (XXS, XS, S, M, L).
 * Перечисление содержит метод getDescription, возвращающий строку "Взрослый размер".
 * Переопределить метод getDescription - для константы XXS метод должен возвращать строку “Детский размер”.
 * Также перечисление должно содержать числовое значение euroSize(32, 34, 36, 38, 40),
 * соответствующее каждому размеру. Создать конструктор, принимающий на вход euroSize.*
 * Создать интерфейсы "Мужская Одежда" с методом "одетьМужчину" и "Женская Одежда" с методом "одетьЖенщину".
 * Создать абстрактный класс Одежда, содержащий переменные - размер одежды, стоимость, цвет.
 * Создать классы наследники Одежды - Футболка (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"),
 * Брюки (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"),
 * Юбка (реализует интерфейсы "Женская Одежда"),
 * Галстук (реализует интерфейсы "Мужская Одежда").
 * Создать массив, содержащий все типы одежды. Создать класс Ателье,
 * содержащий методы одетьЖенщину, одетьМужчину, на вход которых будет поступать массив,
 * содержащий все типы одежды. Метод одетьЖенщину выводит на консоль всю информацию о женской одежде.
 * То же самое для метода одетьМужчину.
 */
public class Main {

    public static void main(String[] args) {
        ArrayList <Bruki> spisokBruks = new ArrayList<>();
        ArrayList <Galstuk> spisokGalstuks = new ArrayList<>();
        ArrayList <Ybka> spisokYbkas = new ArrayList<>();
        ArrayList <Futbolka> spisokFutbolkas = new ArrayList<>();
        ArrayList <Odejda> spisokOdejdy = new ArrayList<>();

        Bruki brukiXXS = new Bruki(RazmerOdejdy.XXS, 156.6, "Black");
        Bruki brukiXS = new Bruki(RazmerOdejdy.XS, 156.6, "Black");
        Bruki brukiS = new Bruki(RazmerOdejdy.S, 156.6, "Black");
        Bruki brukiM = new Bruki(RazmerOdejdy.M, 156.6, "Black");
        Bruki brukiL = new Bruki(RazmerOdejdy.L, 156.6, "Black");

        spisokBruks.add(brukiXXS);
        spisokBruks.add(brukiXS);
        spisokBruks.add(brukiS);
        spisokBruks.add(brukiM);
        spisokBruks.add(brukiL);

        Ybka ybkaXXS = new Ybka(RazmerOdejdy.XXS, 260.0, "Yellow");
        Ybka ybkaXS = new Ybka(RazmerOdejdy.XS, 260.0, "Yellow");
        Ybka ybkaS = new Ybka(RazmerOdejdy.S, 260.0, "Yellow");
        Ybka ybkaM = new Ybka(RazmerOdejdy.M, 260.0, "Yellow");
        Ybka ybkaL = new Ybka(RazmerOdejdy.L, 260.0, "Yellow");

        spisokYbkas.add(ybkaXXS);
        spisokYbkas.add(ybkaXS);
        spisokYbkas.add(ybkaS);
        spisokYbkas.add(ybkaM);
        spisokYbkas.add(ybkaL);

        Galstuk galstukXXS = new Galstuk(RazmerOdejdy.XXS, 15.3, "Green");
        Galstuk galstukXS = new Galstuk(RazmerOdejdy.XS, 15.3, "Green");
        Galstuk galstukS = new Galstuk(RazmerOdejdy.S, 15.3, "Green");
        Galstuk galstukM = new Galstuk(RazmerOdejdy.M, 15.3, "Green");
        Galstuk galstukL = new Galstuk(RazmerOdejdy.L, 15.3, "Green");

        spisokGalstuks.add(galstukXXS);
        spisokGalstuks.add(galstukXS);
        spisokGalstuks.add(galstukS);
        spisokGalstuks.add(galstukM);
        spisokGalstuks.add(galstukL);

        Futbolka futbolkaXXS = new Futbolka(RazmerOdejdy.XXS, 45.0, "White");
        Futbolka futbolkaXS = new Futbolka(RazmerOdejdy.XS, 45.0, "White");
        Futbolka futbolkaS = new Futbolka(RazmerOdejdy.S, 45.0, "White");
        Futbolka futbolkaM = new Futbolka(RazmerOdejdy.M, 45.0, "White");
        Futbolka futbolkaL = new Futbolka(RazmerOdejdy.L, 45.0, "White");

        spisokFutbolkas.add(futbolkaXXS);
        spisokFutbolkas.add(futbolkaXS);
        spisokFutbolkas.add(futbolkaS);
        spisokFutbolkas.add(futbolkaM);
        spisokFutbolkas.add(futbolkaL);

        spisokOdejdy.addAll(spisokBruks);
        spisokOdejdy.addAll(spisokGalstuks);
        spisokOdejdy.addAll(spisokFutbolkas);
        spisokOdejdy.addAll(spisokYbkas);

        Atelie.odetMan(spisokOdejdy);
        System.out.println("------------------------");
        Atelie.odetWoman(spisokOdejdy);
    }
}
