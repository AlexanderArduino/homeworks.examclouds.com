package JavaProgramming.Homework.Lesson9.Task8;

/**
 * 7. Животные
 * Создать класс Animal и расширяющие его абстрактные классы Dog, Cat, Bear.
 * Класс Animal содержит переменную name и абстрактные методы makeNoise, eat, getDescription.
 * Метод makeNoise, например, может выводить на консоль звуки животных. Метод  eat выводит на консоль список того,
 * чем питается данное животное. Метод getDescription возвращает описание животного.
 * Dog, Cat, Bear переопределяют методы makeNoise, eat, getDescription.
 * Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
 * Пусть этот метод распечатывает name и описание пришедшего на прием животного.
 * В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
 * В цикле отправляйте их на прием к ветеринару. В отдельном цикле вызовите методы  makeNoise, eat
 * для каждого животного.
 */

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        Animal cat = new Cat("Musya");
        Animal dog = new Dog("Sharik");
        Animal bear = new Bear("Mishutka");

        List<Animal> animalList = new ArrayList<>();
        animalList.add(cat);
        animalList.add(dog);
        animalList.add(bear);

        Veterinar veterinar = new Veterinar("Doctor Aibolit");
        System.out.println(veterinar.getName());

        for(Animal a: animalList){
            veterinar.treatAnimal(a);
        }

    }
}
