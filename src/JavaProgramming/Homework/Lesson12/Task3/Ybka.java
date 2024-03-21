package JavaProgramming.Homework.Lesson12.Task3;

public class Ybka extends Odejda implements womenClothing{
    public Ybka(RazmerOdejdy razmerOdejdy, double price, String color) {
        super(razmerOdejdy, price, color);
    }

    @Override
    public void putWomenClothin() {
        System.out.println("Женщина надела юбку");
    }

    @Override
    public String toString() {
        return "Ybka{" +
                "razmerOdejdy=" + razmerOdejdy +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
