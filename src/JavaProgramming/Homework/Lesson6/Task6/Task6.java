package JavaProgramming.Homework.Lesson6.Task6;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Task6 {
    private final int[] lamp = new int[32];

    public int[] getLamp() {
        return lamp;
    }

    public void setLamp(int[] massive) {
        for (int i = 0; i < lamp.length; i++) {
            lamp[i] = massive[i];
        }
    }

    /**
     * Заполняе массив рандомными значениями нулей и единиц при помощи Math.random().
     * Ранодомные значения округляются функцией Math.round();
     */
    public void setRandomNumberInLamp() {
        for (int i = 0; i < lamp.length; i++) {
            lamp[i] = (int) Math.round(Math.random());
        }
    }

    /**
     * Меняет состояние каджого элемента в массиве с 0 на 1 или с 1 на ноль столько раз,
     * сколько указано в параметре count;
     *
     * @param count - количество раз, которое нужно инвертировать массив
     */
    public void blinkLamp(int count) {
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < lamp.length; j++) {
                lamp[j] = ~lamp[j];
            }
        }
    }


    public int[] runLeft(int @NotNull [] massive, int count) {
        int[] result = massive;
        for (int j = 0; j < count; j++) {
            result = runLeft(result);
        }
        return result;
    }

    public int[] runLeft(int[] massive){
        int[] result = new int[massive.length];
            for (int i = 1; i < massive.length; i++) {
                result[i - 1] = massive[i];
            }
            result[result.length - 1] = massive[0];
        return result;
    }


    public int[] runLeftUseMassiveCopy(int @NotNull [] massive, int count) {
        int[] result = new int[massive.length];
        for (int i = 0; i < count; i++) {
            System.arraycopy(massive, 1, result, 0, massive.length - 1);
            result[result.length - 1] = massive[0];
            System.arraycopy(result,0,massive,0,massive.length);
        }
        return result;
    }

    public int[] runRight(int[] massive, int count){
        int[] result = new int[massive.length];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < massive.length-1; j++) {
                    result[j+1] = massive[j];
            }
            result[0] = massive[massive.length-1];
            System.arraycopy(result,0,massive,0,massive.length);
        }
        return result;
    }
    public int[] runRightUseMassiveCopy(int @NotNull [] massive, int count) {
        int[] result = new int[massive.length];
        for (int i = 0; i < count; i++) {
            System.arraycopy(massive,0,result,1,massive.length-1 );
            result[0] = massive[massive.length-1];
            System.arraycopy(result,0,massive,0,massive.length);
        }
        return result;
    }


}


class Test {
    public static void main(String[] args) {
        Task6 t = new Task6();
        int[] startMassive = {0,0,0,0, 0,0,0,0, 1,1,1,1, 0,0,0,0, 0,0,0,0, 1,1,1,1, 0,0,0,0, 0,0,0,0};
        t.setLamp(startMassive);

        System.out.println("Задано: " + "\t\t" + Arrays.toString(t.getLamp()));
//        System.out.println("1влево" + "\t\t\t" + Arrays.toString(t.runLeft(t.getLamp())));
        System.out.println("2влево" + "\t\t\t" + Arrays.toString(t.runLeft(t.getLamp(),9)));

    }

    //доделать методы переноса вправо на один и на несколько.
}