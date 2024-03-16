package JavaProgramming.Homework.Lesson12.Task1;

public class Journal implements Printable{

    String name;

    Journal(String name){
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("This is Journal");
    }

    public static void printJournales(Printable[] printables) {
        for(Printable p: printables){
            if(p instanceof Journal){
                System.out.println(((Journal) p).name);
            }
        }
    }
}
