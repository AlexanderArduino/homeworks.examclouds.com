package JavaProgramming.Homework.Lesson9.Task11Magazine;

public class Main {

    public static void main(String[] args) {
        Tovar ogurec = new Tovar("Ogurec", 5.1, 4);
        Tovar pomidor = new Tovar("Pomidor", 8.4, 1);
        Tovar kartofel = new Tovar("Kartofel", 2.4, 2);
        Tovar morkovka = new Tovar("Morkovka", 3.2, 3);
        Tovar svekla = new Tovar("Svekla", 4.8, 3);

        Tovar pomelo = new Tovar("Pomelo", 5.1, 4);
        Tovar banan = new Tovar("Banan", 8.4, 1);
        Tovar limon = new Tovar("Limon", 2.4, 2);
        Tovar apelsin = new Tovar("Apelsin", 3.2, 3);
        Tovar mandarin = new Tovar("Mandarin", 4.8, 3);

        Category ovoshi = new Category("Ovoshi", new Tovar[]{ogurec,pomidor,kartofel,morkovka,svekla});
        Category frukty = new Category("Ovoshi", new Tovar[]{pomelo,banan,limon,apelsin,mandarin});

        Basket basket1 = new Basket(new Tovar[]{ogurec, mandarin, apelsin});
        Basket basket2 = new Basket(new Tovar[]{ogurec, pomidor, pomelo});
        Basket basket3 = new Basket(new Tovar[]{kartofel, svekla, limon});

        User user1 = new User("mama", "123", basket1);
        User user2 = new User("papa", "234", basket2);
        User user3 = new User("tesha", "345", basket3);
        User user4 = new User("test'", "456", basket1);

        System.out.println("Тесть купил: " + user4.basket.toString());
    }
}
