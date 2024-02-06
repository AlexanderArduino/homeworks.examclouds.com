package JavaProgramming.Homework.Lesson5.Task5;

/**
 * 5. Распечатать 10 строк циклом while.
 * Распечатать 10 строк: “Task1”. “Task2”. … “Task10”. Используем цикл while.
 */
public class Test5 {

    public static void main(String[] args) {
        int i = 1;
        while(i < 11){
            System.out.print("\"Task\"" + i + ". ");
            i++;
        }
    }
}
