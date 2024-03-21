package JavaProgramming.Homework.Lesson12.Task3;

public class Bruki extends Odejda implements mansClothing, womenClothing{
    public Bruki(RazmerOdejdy razmerOdejdy, double price, String color) {
        super(razmerOdejdy, price, color);
    }

    @Override
    public void putManClothin() {
        System.out.println("Мужчина надел брюки");
    }

    @Override
    public void putWomenClothin() {
        System.out.println("Женщина надела брюки");
    }

    @Override
    public String toString() {
        return "Bruki{" +
                "razmerOdejdy=" + razmerOdejdy +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
