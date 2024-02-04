package JavaProgramming.Homework.Lesson3.Task6;


import java.util.Scanner;

import static JavaProgramming.Homework.Lesson3.Task3.Calc.*;

public class Summ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = summa(sc.nextInt(), sc.nextInt());
        sc.close();
        System.out.println(a);
    }

}
