package JavaProgramming.Homework.Lesson9.Task11Magazine;

public class Tovar {
    String name;
    double price;
    int rating;

    public Tovar(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + ": cena=" + price;
    }
}
