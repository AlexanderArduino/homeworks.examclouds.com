package JavaProgramming.Homework.Lesson9.Task8;

public class Cat extends Animal{

    Cat(String name){
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Koshka myaukaet");
    }

    @Override
    public void eat() {
        System.out.println("Koshka est myaso, rybu i korm");
    }

    @Override
    public String getDiscription() {
        String s = getName() + "Koshka ne bolshe srednego razmera, pyshistaya";
        return s;
    }
}
