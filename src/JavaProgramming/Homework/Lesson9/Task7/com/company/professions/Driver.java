package JavaProgramming.Homework.Lesson9.Task7.com.company.professions;

public class Driver extends Person{
    double experience;

    public Driver(String name, int age, double experience){
        super(name, age);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", experiuence=" + experience +
                '}';
    }
}
