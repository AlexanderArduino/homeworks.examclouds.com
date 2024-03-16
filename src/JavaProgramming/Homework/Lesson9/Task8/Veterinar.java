package JavaProgramming.Homework.Lesson9.Task8;

public class Veterinar {

    String name;
    Veterinar(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    void treatAnimal(Animal animal){
        System.out.println("K veterinary " + getName() + " na priem prishol " + animal.getName() +
                ". Opisanie jivotnogo: " + animal.getDiscription());
    }
}

