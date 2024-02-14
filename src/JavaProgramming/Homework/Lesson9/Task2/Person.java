package JavaProgramming.Homework.Lesson9.Task2;

/**
 * 2. Класс Person
 * Создать класс Person, который содержит:
 * переменные fullName, age;
 * методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит".
 * Добавьте два конструктора  - Person() и Person(fullName, age).
 * Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
 * Вызовите методы move() и talk().
 */
public class Person {

    String fullName;
    int age;

    public String getFullName(){
        return fullName;
    }
    public int getAge(){
        return age;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public void setAge(int age){
        this.age = age;
    }
    Person(){}
    Person(String fullName, int age){
        setFullName(fullName);
        setAge(age);
    }

    public void move(){
        System.out.println("Person: " + getFullName() + "\t" + "Age: " + getAge() + " идет");
    }

    public void talk(){
        System.out.println("Person: " + getFullName() + "\t" + "Age: " + getAge() + " говорит");
    }
}

class Test{
    public static void main(String[] args) {
        Person pr1 = new Person();
        Person pr2 = new Person("Anokhin", 38);

        pr1.move();
        pr1.talk();

        pr2.move();
        pr2.talk();
    }
}
