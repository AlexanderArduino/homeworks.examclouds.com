package JavaProgramming.Homework.Lesson5.Task1;

/**
 *
 * 1. Четное-нечетное.
 * Передать на вход программы число в качестве аргумента.
 * Если оно нечетное, распечатать его.
 * Используем оператор if.
 * Используйте метод Integer.parseInt() для преобразования из String в int.
 */
public class Test1 {

    public static String whatAreTheNumber(String s){
        int a = Integer.parseInt(s);
        if(a>=0){
            return "pozitiv";
        } else {
            return "negative";
        }
    }
}
