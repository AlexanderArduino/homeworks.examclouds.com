package JavaProgramming.Homework.Lesson6.Task1;



/**
 * 1. Одномерный массив типа String.
 * Создать массив типа String с размером 7.
 * Записать в него значения дней недели.
 * Вывести на консоль значение последнего элемента.
 */
public class Task1 {

    /**
     * Создает массив из дней недели
     * @return - возвращает созданный массив
     */
    public static String[] createDaysOfWeek(){
        String[] daysOfWeek = new String[7];
        daysOfWeek[0] = "Понедельник";
        daysOfWeek[1] = "Вторник";
        daysOfWeek[2] = "Среда";
        daysOfWeek[3] = "Четверг";
        daysOfWeek[4] = "Пятница";
        daysOfWeek[5] = "Суббота";
        daysOfWeek[6] = "Воскресенье";
        return daysOfWeek;
    }
}


class Test{
    public static void main(String[] args) {

        for (String a : Task1.createDaysOfWeek()){
            System.out.println(a);
        }
    }
}
