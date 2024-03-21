package JavaProgramming.Homework.Lesson9.Task11Magazine;

import java.util.Arrays;

public class Category {
    String name;

    Tovar[] tovar;

    public Category(String name, Tovar[] tovar) {
        this.name = name;
        this.tovar = tovar;
    }

    @Override
    public String toString() {
        return name + ":   " + Arrays.toString(tovar) +
                '}';
    }
}
