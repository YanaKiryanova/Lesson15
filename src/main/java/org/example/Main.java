package org.example;

/*

Дополнительное задание
2. Создать коллекцию класса ArrayList со значениями имен всех студентов
в группе
С помощью Stream'ов:
- Вернуть количество количество людей с вашим именем (вне
зависимости от верхнего/нижнего регистра букв)
- Выбрать все имена, начинающиеся на "а" (вне зависимости от
верхнего/нижнего регистра букв)*/

public class Main {
    public static void main(String[] args) {
        System.out.println(TaskOne.list);
        System.out.println("Убирает дубляж");
        TaskOne.dubl();
        System.out.println();
        System.out.println("Оставляем диапозон четных чисел от 7 -17");
        TaskOne.diapason();
        System.out.println();
        System.out.println("Умножаем каждый элемент на 2");
        TaskOne.multiplication();
        System.out.println();
        System.out.println("Сортируем и оставляем 4 первых числа");
        TaskOne.sortFour();
        System.out.println();
        System.out.println("Длина листа");
        TaskOne.lenght();
        System.out.println("Среднее значение");
        TaskOne.mean();
        System.out.println("---------Задание на группу---------");
        TaskTwo.count("Яна");
        System.out.println(" - количество людей с вашим именем");
        System.out.print("Имена  начинающиеся на \"а\" - " );
        TaskTwo.a();

    }

}