package JavaProgramming.Homework.Lesson9.Task8;

public abstract class Animal {

    String name;
    Animal(String name){
        this.name = name;
    }

    abstract public void makeNoise();
    abstract public void eat();
    abstract public String getDiscription();

    public String getName(){
        return name;
    }

}
