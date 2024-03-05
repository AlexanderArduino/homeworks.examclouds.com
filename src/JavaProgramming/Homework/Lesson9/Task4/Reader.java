package JavaProgramming.Homework.Lesson9.Task4;

/*
* Определить класс Reader, хранящий такую информацию о пользователе библиотеки:

ФИО,
номер читательского билета,
факультет,
дата рождения,
телефон.
Методы takeBook(), returnBook().
Разработать программу, в которой создается массив объектов данного класса.
Перегрузить методы takeBook(), returnBook():
- takeBook, который будет принимать количество взятых книг. Выводит на консоль сообщение "Петров В. В. взял 3 книги".
- takeBook, который будет принимать переменное количество названий книг. Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
- takeBook, который будет принимать переменное количество объектов класса Book (создать новый класс, содержащий имя и автора книги). Выводит на консоль сообщение "Петров В. В. взял книги: Приключения, Словарь, Энциклопедия".
 Аналогичным образом перегрузить метод returnBook(). Выводит на консоль сообщение "Петров В. В. вернул книги: Приключения, Словарь, Энциклопедия". Или  "Петров В. В. вернул 3 книги".*/
public class Reader {
    String fio;
    int id;
    String facultet;
    int phone;

    private int count = 0;

    Reader(){}
    Reader(String fio, int id, String facultet, int phone){
        this.fio = fio;
        this.id = id;
        this.facultet = facultet;
        this.phone = phone;
    }

    public String getFio(){
        return this.fio;
    }
    public int getId(){
        return this.id;
    }
    public String getFacultet(){
        return this.facultet;
    }
    public int getPhone(){
        return this.phone;
    }
    public int getCount(){return this.count;}

    public void setFio(String fio){
        this.fio = fio;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setFacultet(String facultet){
        this.facultet = facultet;
    }
    public void setPhone(int phone){
        this.phone = phone;
    }

    public void takeBook(){
        count++;
    }

    public void returnBook(){
        if (count > 0 ){
            count--;
        } else {
            count = 0;
        }
    }

    /**
     * Взятие книг
     * @param number
     */
    public void takeBook(int number){
        count += number;
        System.out.println("Читатель: " + fio +". Взято сейчас: " + number + ". Всего книг на руках: " + count);
    }

    /**
     * Возврат книг
     * @param number
     */
    public void returnBook(int number){
        if(count < number || count == 0){
            count = 0;
        } else {
            count -= number;
        }
        System.out.println("Читатель: " + fio +". Сдал сейчас: " + number + ". Всего книг на руках: " + count);

    }

    /**
     * Сколько книг сейчас на руках
     */
    public void printHowBookTake(){
        System.out.println("Книг на руках: " + count);
    }

}

class Test{

    public static void main(String[] args) {
        Reader rd1 = new Reader("Petrov", 1, "ABC", 123456);



        rd1.takeBook(2);
        rd1.printHowBookTake();
        rd1.returnBook(1);
        rd1.printHowBookTake();




    }
}
