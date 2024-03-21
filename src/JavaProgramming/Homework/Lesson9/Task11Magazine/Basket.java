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
        return "в корзине: " + Arrays.toString(basketTovar);
    }
}
