package JavaProgramming.Homework.Lesson9.Task7.com.company.venicles;
import JavaProgramming.Homework.Lesson9.Task7.com.company.professions.*;
import JavaProgramming.Homework.Lesson9.Task7.com.company.details.*;

public class Car {
    String carClass;
    String marka;
    Driver driver;
    Engine engine;


    public Car(String carClass, String marka, Driver driver, Engine engine){
        this.carClass = carClass;
        this.marka = marka;
        this.driver = driver;
        this.engine = engine;
    }

    public void start(){
        System.out.println("Car: " + carClass + "Marka: " + marka + "nachal dvijenie");
    }
    public void stop(){
        System.out.println("Car: " + carClass + "Marka: " + marka + "ostanovilsya");
    }
    public void turnLeft(){
        System.out.println("Car: " + carClass + "Marka: " + marka + "povernul nalevo");
    }
    public void turnRight(){
        System.out.println("Car: " + carClass + "Marka: " + marka + "povernul napravo");
    }

    @Override
    public String toString() {
        return "Car{" +
                "carClass='" + carClass + '\'' +
                ", marka='" + marka + '\'' +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}

class Lorry extends Car{

    int weight;

    public Lorry(String carClass, String marka, Driver driver, Engine engine, int weight) {
        super(carClass, marka, driver, engine);
        this.weight = weight;
    }
}

class SportCar extends Car{
    int maxSpeed;

    public SportCar(String carClass, String marka, Driver driver, Engine engine, int maxSpeed) {
        super(carClass, marka, driver, engine);
    }
}
