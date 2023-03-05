// Программа сравнивает время добавления 100 000 элементов на первую позицию в список для ArrayList и LinkedList

package Homework.Homework_03;

import java.util.ArrayList;
import java.util.LinkedList;

public class Program_02 {
    public static void main(String[] args) {
        
        ArrayList<String> list1 = new ArrayList<>();
        LinkedList<String> list2 = new LinkedList<>();

        long begin = System.currentTimeMillis();  
        for( int i = 0; i < 100000; i++){ 
            list1.add(0, "!");
        }
        long end = System.currentTimeMillis(); 
        System.out.println(end - begin);
              
        begin = System.currentTimeMillis();  
        for(int i = 0; i < 100000; i++){ 
            list2.addFirst("!");
        }
        end = System.currentTimeMillis(); 
        System.out.println(end - begin);
    }
}
