package JavaProgramming.Homework.Lesson4.Task2;

public class Test2 {

    public static double minimalNumber(double a, double b, double c){

        double result = Math.min(Math.abs(a), Math.abs(b));
        result = Math.min(result, Math.abs(c));

        return result;
    }

    public static void main(String[] args) {

        System.out.println(minimalNumber(0.000000000000001 , -4.3, -1.2));
    }
}
