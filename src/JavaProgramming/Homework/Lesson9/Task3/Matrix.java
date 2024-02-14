package JavaProgramming.Homework.Lesson9.Task3;

import java.util.Arrays;

/**
 * 3. Класс Матрица
 * Создать класс "Матрица". Класс должен иметь следующие переменные:
 * двумерный массив вещественных чисел;
 * количество строк и столбцов в матрице.
 * Класс должен иметь следующие методы:
 * сложение с другой матрицей;
 * умножение на число;
 * вывод на печать;
 * умножение матриц.
 */
public class Matrix {
    private int kolichestvoStolbcov;        //Количество столбцов матрицы
    private int kolichestvoStrok;           //Количество строк матрицы
    private double[][] matrix;              // Сама матрица

    /**
     * Конструктор создания двухмерной матрицы с заданным количеством строк и столбцов
     *
     * @param kolichestvoStrok    - количество строк
     * @param kolichestvoStolbcov - количство столбцов
     */
    Matrix(int kolichestvoStrok, int kolichestvoStolbcov) {
        this.matrix = new double[kolichestvoStrok][kolichestvoStolbcov];
    }

    public int getKolichestvoStolbcov() {
        return kolichestvoStolbcov;
    }

    public int getKolichestvoStrok() {
        return kolichestvoStrok;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public void setKolichestvoStolbcov(int kolichestvoStolbcov) {
        this.kolichestvoStolbcov = kolichestvoStolbcov;
    }

    public void setKolichestvoStrok(int kolichestvoStrok) {
        this.kolichestvoStrok = kolichestvoStrok;
    }

    public void setMatrix(double[][] matrix) {
        this.matrix = matrix;
    }

    /**
     * Заполнение матрицы рандомными целыми положительными числами
     */
    private double[][] fillMatrixRandomPozitiveIntegerNumber() {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                this.matrix[i][j] = Math.round(Math.random() * Math.random() * 100);
            }
        }
        return matrix;
    }

    /**
     * Заполнение матрицы целыми случайными положительными и отрицательными числами
     */
    public void fillMatrixRandomIntegerNumber() {
        this.matrix = fillMatrixRandomPozitiveIntegerNumber();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (Math.random() < 0.5) {
                    matrix[i][j] *= -1;
                }
            }
        }
    }

    /**
     * Заполнение матрицы рандомными вещественными положительными числами
     */
    private double[][] fillMatrixRandomPozitiveDoubleNumber(int number) {
        for (int i = 0; i < this.matrix.length; i++) {
            for (int j = 0; j < this.matrix[i].length; j++) {
                double value = (Math.random() * Math.random() * 100);
                double scale = Math.pow(10, number);
                this.matrix[i][j] = Math.ceil(value * scale) / scale;
            }
        }
        return matrix;
    }

    /**
     * Заполнение матрицы вещественными случайными положительными и отрицательными числами
     *
     * @param number - количество знаков после запятой
     */
    public void fillMatrixRandomDoubleNumber(int number) {
        this.matrix = fillMatrixRandomPozitiveDoubleNumber(number);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (Math.random() < 0.5) {
                    matrix[i][j] *= -1;
                }
            }
        }
    }

    /**
     *
     */
    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

}


class Test {
    public static void main(String[] args) {
        Matrix mx1 = new Matrix(3, 4);
        Matrix mx2 = new Matrix(3, 4);

        mx1.fillMatrixRandomIntegerNumber();
        System.out.println(" ");
        mx1.printMatrix();

//        mx2.fillMatrixRandomPozitiveDoubleNumber(5);
//        System.out.println(" ");
//        mx2.printMatrix();


        double value = Math.random() * Math.random() * 100;
        double scale = Math.pow(10, 3);


    }
}