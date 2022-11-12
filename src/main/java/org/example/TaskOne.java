package org.example;

import java.util.ArrayList;
import java.util.List;

public class TaskOne {
   public static List <Integer> list = random();

    public static List<Integer> random() {
        List<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            int a = (int) (Math.random() * 30);
            list.add(i, a);
        }
       return list;
    }
    public static void dubl (){
        list.stream().distinct().toList().forEach(result -> System.out.print(result + " ") );
    }
    public static void diapason(){
        list.stream().filter(x -> x > 7 && x < 17 && x % 2 == 0).forEach(result -> System.out.print(result + " "));
    }
    public static void multiplication(){
        list.stream().map((s)-> s * 2).forEach(result -> System.out.print(result + " "));
    }
    public static void sortFour (){
        list.stream().sorted().limit(4).forEach(result -> System.out.print(result + " "));
    }
    public static void lenght (){
        System.out.println(list.stream().count());
    }
    public static void mean () {
        System.out.println(list.stream().mapToInt(Integer::intValue).average().orElse(0));
    }
}
