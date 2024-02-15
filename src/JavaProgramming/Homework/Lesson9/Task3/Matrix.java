package JavaProgramming.Homework.Lesson9.Task3;

import java.util.Arrays;

/**
 * 3. Класс Матрица.
 * Создать класс "Матрица". Класс должен иметь следующие переменные:
 * +++двумерный массив вещественных чисел;
 * +++количество строк и столбцов в матрице.
 * Класс должен иметь следующие методы:
 * +++сложение с другой матрицей;
 * +++умножение на число;
 * +++вывод на печать;
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
        this.kolichestvoStrok = kolichestvoStrok;
        this.kolichestvoStolbcov = kolichestvoStolbcov;
        this.matrix = new double[kolichestvoStrok][kolichestvoStolbcov];
    }

    public int getKolichestvoStolbcov() {
        return this.kolichestvoStolbcov;
    }

    public int getKolichestvoStrok() {
        return this.kolichestvoStrok;
    }

    public double getValue(int row, int col) {
        return matrix[row][col];
    }

    public void setValue(int row, int col, double value) {
        matrix[row][col] = value;
    }

    public double[][] getMatrix() {
        return this.matrix;
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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.round(Math.random() * Math.random() * 100);
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
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                double value = (Math.random() * Math.random() * 100);
                double scale = Math.pow(10, number);
                matrix[i][j] = Math.ceil(value * scale) / scale;
            }
        }
        return matrix;
    }

    /**
     * Заполнение матрицы вещественными случайными положительными и отрицательными числами
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
     * Вывод матрицы в консоль поэлементно
     */
    public void printMatrix() {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }


    /**
     * Сложение двух матриц. Производит проверку на правило сложение: можно
     * складывать только матрицы с одинаковым количеством строк и столбцов
     * @param a - Матрица 1
     * @param b - Матрица 2
     * @return - возвращает матрицу с результатом сложения матрицы А с матрицей В
     */
    public static Matrix summary(Matrix a, Matrix b) {
        if(a.getKolichestvoStrok() != b.getKolichestvoStrok() || a.getKolichestvoStolbcov() != b.getKolichestvoStolbcov()){
            return new Matrix(0,0);
        }
        int rows = a.getKolichestvoStrok();
        int cols = a.getKolichestvoStolbcov();
        Matrix x = new Matrix(2, 2);
        for (int i = 0; i < a.getKolichestvoStrok(); i++) {
            for (int j = 0; j < a.getKolichestvoStolbcov(); j++) {
                x.setValue(i,j, (a.getValue(i,j) + b.getValue(i,j)));
            }
        }
        return x;
    }

    /**
     * Умножение матрицы на число А.
     * @param a - число
     * @return - матрица такого же размера
     */
    public  Matrix multiply(Number a){
        Matrix tmp = new Matrix(kolichestvoStrok,kolichestvoStolbcov);
        for (int i = 0; i < kolichestvoStrok; i++) {
            for (int j = 0; j < this.kolichestvoStolbcov; j++) {
                tmp.setValue(i,j, this.getValue(i,j) * a.doubleValue());
            }
        }
        return tmp;
    }

    /**
     * НЕ ДОПИСАН!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Умножение матрицы на матрицу
     * @param a
     * @return
     */
    public Matrix multiply(Matrix a, Matrix b){
        if(a.getKolichestvoStolbcov() != b.getKolichestvoStrok()){
            return new Matrix(0,0);
        }
        return new Matrix(0,0);
    }

}


class Test {
    public static void main(String[] args) {
        Matrix mx1 = new Matrix(2, 2);
        Matrix mx2 = new Matrix(2, 2);
        mx1.fillMatrixRandomIntegerNumber();
        mx2.fillMatrixRandomIntegerNumber();
        mx1.printMatrix();
//        mx2.printMatrix();

//        Matrix mx3 = Matrix.summary(mx1,mx2);
//        mx3.printMatrix();

        Matrix mx4 = mx1.multiply(2);
        mx4.printMatrix();
    }
}