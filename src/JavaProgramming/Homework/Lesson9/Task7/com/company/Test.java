package JavaProgramming.Homework.Lesson9.Task7.com.company;

import JavaProgramming.Homework.Lesson9.Task7.com.company.venicles.Car;
import JavaProgramming.Homework.Lesson9.Task7.com.company.professions.Driver;
import JavaProgramming.Homework.Lesson9.Task7.com.company.details.Engine;

/**
 * 7. Автомобили
 * Создать класс Car в пакете com.company.vehicles, Engine в пакете com.company.details и Driver в пакете com.company.professions.
 * Класс Driver содержит поля - ФИО, стаж вождения.
 * Класс Engine содержит поля - мощность, производитель.
 * Класс Car содержит поля - марка автомобиля, класс автомобиля, водитель типа Driver, мотор типа Engine. Методы start(), stop(), turnRight(), turnLeft(), которые выводят на печать: "Поехали", "Останавливаемся", "Поворот направо" или "Поворот налево". А также метод toString(), который выводит полную информацию об автомобиле, ее водителе и моторе.
 * Создать производный от Car класс  - Lorry (грузовик), характеризуемый также грузоподъемностью кузова.
 * Создать производный от Car класс - SportCar, характеризуемый также предельной скоростью.
 * Пусть класс Driver расширяет класс Person.
 */
public class Test {

    public static void main(String[] args) {
        Engine engine1 = new Engine("Renault", 130);
        Engine engine2= new Engine("BMW", 220);
        Engine engine3= new Engine("LADA", 98);
        Engine engine4= new Engine("MOSKVICH", 65);

        Driver driver1 = new Driver("Ivanych", 56, 26);
        Driver driver2 = new Driver("Petrovich", 38, 18);
        Driver driver3 = new Driver("Nikitich",29, 11);
        Driver driver4 = new Driver("Glashkin",68, 37);

        Car car1 = new Car("RENAULT", "LOGAN", driver1, engine1);
        Car car2 = new Car("BMW", "M5", driver2, engine2);
        Car car3 = new Car("JAGUAR", "J4", driver3, engine3);
        Car car4 = new Car("PORSHE", "P2", driver4, engine4);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
    }
}
