package JavaProgramming.Homework.Lesson9.Task8;

public class Bear extends Animal{

    Bear(String name){
        super(name);
    }
    @Override
    public void makeNoise() {
        System.out.println("Medved revet");
    }

    @Override
    public void eat() {
        System.out.println("Medved revet");
    }

    @Override
    public String getDiscription() {
        String s = getName() + "Medved ogromnogo razmera, imeet ogromnye kogti";
        return s;
    }
}
