package JavaProgramming.Homework.Lesson12.Task2;

public class Test {

    public static void main(String[] args) {
        MonthOfYear monthOfYear = MonthOfYear.APRIL;

        switch (monthOfYear){
            case JANUARY -> System.out.println("I like JANUARY");
            case FEBRUARY -> System.out.println("I like FEBRUARY");
            case MATCH -> System.out.println("I like MATCH");
            case APRIL -> System.out.println("I like APRIL");
            case MAY -> System.out.println("I like MAY");
            case JUNE -> System.out.println("I like JUNE");
            case JULE -> System.out.println("I like JULE");
            case AUGUST -> System.out.println("I like AUGUST");
            case SEPTEMBER -> System.out.println("I like SEPTEMBER");
            case OCTOBER -> System.out.println("I like OCTOBER");
            case NOVEMBER -> System.out.println("I like NOVEMBER");
            case DECEMBER -> System.out.println("I like DECEMBER");
        }
    }
}
