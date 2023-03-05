// Программа создает список цветов в виде коллекции и изменяет ее

package Homework.Homework_03;

import java.util.ArrayList;

public class Program_01 {
    public static void main(String[] args) {
        
        ArrayList<String> colours = new ArrayList<>();
        colours.add("red");
        colours.add("green");
        colours.add("blue");
        System.out.println(colours);
      
    // Добавление к каждому элементу символа '!'
        for (int i = 0; i < colours.size(); i++){
            colours.set(i, colours.get(i) + "!");
        }
        System.out.println(colours);

    // Добавление элемента на первою позицию
        colours.add(0, "white");
        System.out.println(colours);

    // Вывод элемента по индексу
        System.out.println(colours.get(1));

    // Изменение элемента по индексу
        colours.set(0, "black!");
        System.out.println(colours);

    // Удаление третьего элемента
        colours.remove(2);
        System.out.println(colours);

    // Поиск индекса элемента
        System.out.println(colours.indexOf("red!"));

    // Создание нового списока с некоторыми элементами из первого списка
        ArrayList<String> colours2 = new ArrayList<>();
        colours2.add("red!");
        colours2.add("green!");
        colours2.add("blue!");
        System.out.println(colours2);

    // Удаление из первого списка всех элементов отсутствующих во втором 
        colours.retainAll(colours2);
        System.out.println(colours);

    // Сортировка второго списка
        colours2.sort(null);
        System.out.println(colours2);
    }
}
