package JavaProgramming.Homework.Lesson9.Task5;

/*
* Даны два целых числа A и В. Выведите все числа от A до B включительно,
* в порядке возрастания, если A < B, или в порядке убывания в противном случае.
* Использовать рекурсию.
*
* СДЕЛАНО КОРЯВО, ВЫСКАКИВАЕТ ИСКЛЮЧЕНИЕ StackOverflow
* */
public class Test5 {

    public static void printNumber(int a, int b){
        if(a == b) {
            System.out.println(a);
        } else if(a < b){
            System.out.print(a + " ");
            a++;
            printNumber(a,b);
        } else if(a>b){
            System.out.print(a + " ");
            a--;
            printNumber(a,b);
        }
    }

    public static void main(String[] args) {
        printNumber(1,1);
        printNumber(1,500);
        printNumber(500,1);
    }
}


