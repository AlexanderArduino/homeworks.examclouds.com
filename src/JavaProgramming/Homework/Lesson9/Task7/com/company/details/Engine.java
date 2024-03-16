package JavaProgramming.Homework.Lesson9.Task7.com.company.details;

public class Engine {
    String company;
    int power;

    public Engine(String company, int power){
        this.company = company;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "company='" + company + '\'' +
                ", power=" + power +
                '}';
    }
}
