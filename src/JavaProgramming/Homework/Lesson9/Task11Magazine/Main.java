package JavaProgramming.Homework.Lesson9.Task11Magazine;

public class Main {

    public static void main(String[] args) {
        Tovar ogurec = new Tovar("Огурец", 5.1, 4);
        Tovar pomidor = new Tovar("Помидор", 8.4, 1);
        Tovar kartofel = new Tovar("Картофель", 2.4, 2);
        Tovar morkovka = new Tovar("Морковь", 3.2, 3);
        Tovar svekla = new Tovar("Свекла", 4.8, 3);

        Tovar pomelo = new Tovar("Помело", 5.1, 4);
        Tovar banan = new Tovar("Банан", 8.4, 1);
        Tovar limon = new Tovar("Лимон", 2.4, 2);
        Tovar apelsin = new Tovar("Апельсин", 3.2, 3);
        Tovar mandarin = new Tovar("Мандарин", 4.8, 3);

        Tovar funduk = new Tovar("Фундук", 8.2, 2);
        Tovar keshu = new Tovar("Кешью", 9.7, 2);
        Tovar gretskie = new Tovar("Грецкий", 4.9, 2);


        Category ovoshi = new Category("Овощи", new Tovar[]{ogurec,pomidor,kartofel,morkovka,svekla});
        Category frukty = new Category("Фрукты", new Tovar[]{pomelo,banan,limon,apelsin,mandarin});
        Category orehi = new Category("Орехи", new Tovar[]{funduk,keshu,gretskie});

        Basket basket1 = new Basket(new Tovar[]{ogurec, mandarin, apelsin});
        Basket basket2 = new Basket(new Tovar[]{ogurec, pomidor, pomelo});
        Basket basket3 = new Basket(new Tovar[]{kartofel, svekla, limon});

        User user1 = new User("мама", "123", basket1);
        User user2 = new User("папа", "234", basket2);
        User user3 = new User("теща", "345", basket3);
        User user4 = new User("тесть", "456", basket1);

        System.out.println("У " + user4.getLogin() + " "  + user4.basket.toString());
        System.out.println(" ");
        System.out.println("Katalog: " + "\n" +
                ovoshi + "\n" + frukty + "\n" + orehi);
    }
}
