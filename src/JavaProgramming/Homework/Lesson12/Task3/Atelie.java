package JavaProgramming.Homework.Lesson12.Task3;

import java.util.ArrayList;

public class Atelie{

    public static void odetWoman(ArrayList<Odejda> list){
            for( Odejda o : list){
                if(o instanceof womenClothing){
                    System.out.println(o + " - это женская одежда");
                }
            }
    }

    public static void odetMan(ArrayList<Odejda> list){
        for(Odejda o : list) {
            if(o instanceof mansClothing){
                System.out.println(o + " - это мужская одежда");
            }
        }
    }

}
