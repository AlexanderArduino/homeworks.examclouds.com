package JavaProgramming.Homework.Lesson12.Task1;

public class Book implements Printable {

    String name;

    Book(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public void print() {
        System.out.println("This is Book" + name);
    }

    public static void printBooks(Printable[] printables) {
            for(Printable p: printables){
                if(p instanceof Book){
                    System.out.println(((Book) p).name);
                }
        }
    }
}
