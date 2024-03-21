package JavaProgramming.Homework.Lesson12.Task3;

public class Galstuk extends Odejda implements mansClothing{
    public Galstuk(RazmerOdejdy razmerOdejdy, double price, String color) {
        super(razmerOdejdy, price, color);
    }

    @Override
    public void putManClothin() {
        System.out.println("Мужчина надел галстук");
    }

    @Override
    public String toString() {
        return "Galstuk{" +
                "razmerOdejdy=" + razmerOdejdy +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
