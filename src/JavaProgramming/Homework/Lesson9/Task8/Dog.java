package JavaProgramming.Homework.Lesson9.Task8;

public class Dog extends Animal{

    Dog(String name){
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(getName() + "laet");
    }

    @Override
    public void eat() {
        System.out.println(getName() + "est myaso i suhoi korm");
    }

    @Override
    public String getDiscription() {
        String s = getName() + "Sobaka imeet hvost, 4 lapy i 2 uha";
        return s;
    }
}
