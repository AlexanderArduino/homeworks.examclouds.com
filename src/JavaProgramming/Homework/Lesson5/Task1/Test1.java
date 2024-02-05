package JavaProgramming.Homework.Lesson5.Task1;

public class Test1 {

    public static String whatAreTheNumber(String s){
        int a = Integer.parseInt(s);
        if(a>=0){
            return "pozitiv";
        } else {
            return "negative";
        }
    }
}
