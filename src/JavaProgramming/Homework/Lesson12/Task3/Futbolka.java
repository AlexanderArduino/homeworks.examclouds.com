package JavaProgramming.Homework.Lesson12.Task3;

public class Futbolka extends Odejda implements mansClothing, womenClothing{

    public Futbolka(RazmerOdejdy razmerOdejdy, double price, String color) {
        super(razmerOdejdy, price, color);
    }

    @Override
    public void putManClothin() {
        System.out.println("Мужчина надел футболку");
    }

    @Override
    public void putWomenClothin() {
        System.out.println("Женщина надела футболку");
    }

    @Override
    public String toString() {
        return "Futbolka{" +
                "razmerOdejdy=" + razmerOdejdy +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
