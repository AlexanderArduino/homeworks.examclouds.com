package JavaProgramming.Homework.Lesson12.Task1;

/**
 * 1. Интерфейс Printable.
 * Определить интерфейс Printable, содержащий метод void print().
 * Определить класс Book, реализующий интерфейс Printable.
 * Определить класс Magazine, реализующий интерфейс Printable.
 * Создать массив типа Printable, который будет содержать книги и журналы.
 * В цикле пройти по массиву и вызвать метод print() для каждого объекта.
 * Создать статический метод printMagazines(Printable[] printable) в классе Magazine,
 * который выводит на консоль названия только журналов.
 * Создать статический метод printBooks(Printable[] printable) в классе Book,
 * который выводит на консоль названия только книг. Используем оператор instanceof.
 */
public class Test {
    public static void main(String[] args) {
        Book book1 = new Book("Приключения электроника");
        Book book2 = new Book("Ellada Gomera");
        Book book3 = new Book("Bibliya");

        Journal journal1 = new Journal("GQ");
        Journal journal2 = new Journal("Vyshivanie");
        Journal journal3 = new Journal("Gamer");

        Printable[] printables = new Printable[6];
        printables[0] = book1;
        printables[2] = book2;
        printables[4] = book3;
        printables[1] = journal1;
        printables[3] = journal2;
        printables[5] = journal3;

        System.out.println("Spisok knig: ");
        Book.printBooks(printables);
        System.out.println(" ");
        System.out.println("Spisok jurnalov: ");
        Journal.printJournales(printables);
    }
}
