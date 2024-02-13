package JavaProgramming.Homework.Lesson9.Task1;

public class Phone {
    int number;
    String model;
    double weight;

    Phone(int number, String model){
        this.number = number;
        this.model = model;
        this.weight = 0.1;
    }
    Phone(int number, String model, double weight){
        this(number, model);
        this.weight = weight;
    }
    Phone(){};

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void printInfo(){
        System.out.print("Phone number: " + this.number + "\t");
        System.out.print("Phone model: " + this.model + "\t");
        System.out.println("Phone weight: " + this.weight);
    }

    public void receiveCall(String name){
        System.out.println("Звонит: " + name);
    }

    public void receiveCall(String name, int number){
        System.out.print("Name of calling: " + name);
        System.out.println("Number of calling: " + number);
    }

    public static void sendMessage(int ... number){
        for(int n : number) {
            System.out.println(n);
        }
    }
}



class Test {
    public static void main(String[] args) {
        Phone ph1 = new Phone(1, "A", 0.1);
        Phone ph2 = new Phone(2, "B", 0.2);
        Phone ph3 = new Phone(3, "C", 0.3);


        ph1.printInfo();
        ph2.printInfo();
        ph3.printInfo();

        ph1.receiveCall("Kolya");
        ph2.receiveCall("Vasya");
        ph3.receiveCall("Petya");

        System.out.print("PH1 number: " + ph1.getNumber() + "\t");
        System.out.print("PH2 number: " + ph2.getNumber() + "\t");
        System.out.println("PH3 number: " + ph3.getNumber());

        ph1.receiveCall("Kolya", 123456);
        ph1.receiveCall("Vasya", 234567);
        ph1.receiveCall("Petya", 345678);

        Phone.sendMessage(123, 456, 789, 234,567,890);
    }
}
