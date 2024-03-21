package JavaProgramming.Homework.Lesson12.Task3;

public abstract class Odejda {
    RazmerOdejdy razmerOdejdy;
    double price;
    String color;

    public Odejda(RazmerOdejdy razmerOdejdy, double price, String color) {
        this.razmerOdejdy = razmerOdejdy;
        this.price = price;
        this.color = color;
    }
}
