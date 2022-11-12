package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class  TaskTwo {

    public static List<String> people = add() ;
    public static List<String> add() {
        List <String> name = new ArrayList<>();
        name.add("Яна");
        name.add("Мария");
        name.add("Даниил");
        name.add("Роман");
        name.add("Валерия");
        name.add("Юля");
        name.add("Данила");
        name.add("Грегори");
        name.add("Саня");
        name.add("Святослав");
        name.add("Ольга");
        name.add("Ирина");
        name.add("Лиза");
        name.add("Александр");
        name.add("Оля");
        name.add("Денис");
        name.add("Глеб");
        name.add("Дмитрий");
        return name;
    }
    public static void count (String name){
        System.out.print(people.stream().filter(name::equalsIgnoreCase).count());
    }
    public static void a (){
       people.stream().filter((s) -> s.toLowerCase().startsWith("а")).map(String::valueOf).forEach(System.out::print);
    }





}
