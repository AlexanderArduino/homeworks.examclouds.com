package JavaProgramming.Homework.Lesson5.Task7;

/**
 * 7. Распечатать 5 символом циклом for.
 * Распечатать 5 символов в одну строку начиная с ‘h’. Используем цикл for.
 */
public class Test7 {

    public static void printSumbols(char startSumbol, int numberSimbols){
        int a = (int) startSumbol;
        for (int i = a; i < (a + numberSimbols); i++) {
            System.out.println((char)i);
        }
    }

    public static void main(String[] args) {
        printSumbols('h', 5);
    }
}
