package JavaProgramming.Homework.Lesson3.Task2;

/**
 * Создать программу, в которой вывести на консоль литералы следующих видов:
 *
 * логический
 * строковый
 * символьный
 * целочисленный 2-й
 * целочисленный 8-й
 * целочисленный 10-й
 * целочисленный 16-й
 * литерал типа float
 * литерал типа double.
 */
public class Test {

    public static void main(String[] args) {
        boolean b  = true;
        String s = "Hello";
        char c = 'c';
        int binary = 0b0001;
        int oct = 077;
        int tenty = 100;
        int hex = 0x3F;
        float f = 100.5F;
        double d = 100.6;

        System.out.println(b);
        System.out.println(s);
        System.out.println(c);
        System.out.println(binary);
        System.out.println(oct);
        System.out.println(tenty);
        System.out.println(hex);
        System.out.println(f);
        System.out.println(d);
    }
}
