package JavaProgramming.Homework.Lesson9.Task11Magazine;

import java.util.ArrayList;
import java.util.Arrays;

public class Basket {
    Tovar[] basketTovar;

    public Basket(Tovar[] basketTovar) {
        this.basketTovar = basketTovar;
    }

    @Override
    public String toString() {
        return "Basket{" + "basketTovar=" + Arrays.toString(basketTovar) + '}';
    }
}
