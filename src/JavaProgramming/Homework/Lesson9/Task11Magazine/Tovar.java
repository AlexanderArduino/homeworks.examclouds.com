package JavaProgramming.Homework.Lesson9.Task11Magazine;

public class Tovar {
    String name;
    double cena;
    int rating;

    public Tovar(String name, double cena, int rating) {
        this.name = name;
        this.cena = cena;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return '\"' + name + '\'' +
                ", cena=" + cena +
                ", rating=" + rating +
                '}';
    }
}
