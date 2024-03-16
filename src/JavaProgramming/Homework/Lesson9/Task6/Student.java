package JavaProgramming.Homework.Lesson9.Task6;

import java.util.ArrayList;
import java.util.List;

/**
 * 5. Наследование Student, Aspirant
 * Создайте пример наследования, реализуйте класс Student и класс Aspirant, аспирант отличается от студента
 * наличием некой научной работы.
 * Класс Student содержит переменные: String firstName, lastName, group. А также, double averageMark,
 * содержащую среднюю оценку.
 * Создать метод getScholarship() для класса Student, который возвращает сумму стипендии.
 * Если средняя оценка студента равна 5, то сумма 2000 грн, иначе 1900. Переопределить этот метод в классе Aspirant.
 * Если средняя оценка аспиранта равна 5, то сумма 2500 грн, иначе 2200.
 * Создать массив типа Student, содержащий объекты класса Student и Aspirant.
 * Вызвать метод getScholarship() для каждого элемента массива.
 */
public class Student {
    String firstName;
    String lastName;
    String group;
    public double averageMark;

    Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public int getSchoolarSalary() {
        if (averageMark >= 5) {
            return 2000;
        } else {
            return 1900;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' + "\t" +
                ", lastName='" + lastName + '\'' + "\t" +
                ", group='" + group + '\'' + "\t" +
                ", averageMark=" + averageMark +
                '}';
    }
}

class Aspirant extends Student {

    Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    public int getSchoolarSalary(){
        if(averageMark >= 5){
            return 2500;
        } else {
            return 2200;
        }
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "firstName='" + firstName + '\'' + "\t" +
                ", lastName='" + lastName + '\'' + "\t" +
                ", group='" + group + '\'' + "\t" +
                ", averageMark=" + averageMark +
                '}';
    }
}

class Test{
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        Student student1 = new Student("Ivan", "Alekseev", "123", 2.7);
        Student student2 = new Student("Petr", "Ivanov", "234", 3.1);
        Student student4 = new Student("Aleksey", "Petrov", "245", 8.6);
        Student student3 = new Student("Grigorii", "Azarov", "324", 7.3);
        Student student5 = new Student("Nikolay", "Kachkin", "466", 6.2);

        Aspirant aspirant1 = new Aspirant("Veselina", "Miteva", "2-14", 6.6);
        Aspirant aspirant2 = new Aspirant("Natalya", "Sotnikova", "3-11", 3.6);
        Aspirant aspirant3 = new Aspirant("Olga", "Prokofeeva", "3-06", 4.2);
        Aspirant aspirant4 = new Aspirant("Marina", "Rodionova", "3-06", 6.6);
        Aspirant aspirant5 = new Aspirant("Ludmila", "Anokhina", "4-08", 9.4);

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(aspirant1);
        list.add(aspirant2);
        list.add(aspirant3);
        list.add(aspirant4);
        list.add(aspirant5);


        for(Student s: list){
            System.out.println(s + "\t\tSalary: " + s.getSchoolarSalary());
        }
    }
}



