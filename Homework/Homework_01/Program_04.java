// Программа присваивает массиву m все значения некратные n числа в диапазоне от Short.MIN_VALUE до случайного числа

package Homework.Homework_01;

import java.util.ArrayList;
import java.util.Random;

public class Program_04 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList <Integer>();
        int n = 10;
        int r = 100;
        
        for(int i = Short.MIN_VALUE; i < new Random().nextInt(r); i++){
            if (i % n != 0) list.add(i);
        }

        System.out.println(list);
    }
    
}





     