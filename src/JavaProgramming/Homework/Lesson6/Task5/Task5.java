package JavaProgramming.Homework.Lesson6.Task5;

public class Task5 {



    public static int minValue(int[] a){
        int result = a[0];
        for (int j : a) {
            if (result > j) {
                result = j;
            }
        }
        return result;
    }

    public static int maxValue(int[] a){
        int result = a[0];
        for (int i = 0; i < a.length; i++) {
            if(result < a[i]){
                result = a[i];
            }
        }
        return result;
    }
}

class Test{
    static int[][] massive = {{1, 2, 37, 4, 56, 6, 74, 8},
            {34, 142, 13, 174, 15, 16, 167, 18},
            {35, 232, 237, 264, 275, 26, 247, 28},
            {76, 382, 33, 364, 358, 346, 37, 38},
            {143, 442, 473, 464, 475, 46, 47, 11}};



    public static void main(String[] args) {

        for (int i = 0; i < massive.length; i++) {
            System.out.print("Minimum: " + Task5.minValue(massive[i]) + "\tMaximum: " + Task5.maxValue(massive[i]) + "\n");
        }

        for(int a : massive[0]) {
            System.out.println(a);
        }

    }
}
