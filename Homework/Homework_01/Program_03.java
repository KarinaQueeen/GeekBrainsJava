// Программа добавляет в массив m все значения кратные n числа в диапазоне от случайного числа до Short.MAX_VALUE 

package Homework.Homework_01;

import java.util.ArrayList;
import java.util.Random;

public class Program_03 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList <Integer>();
        int n = 148;
        int r = 100;

        for(int i = new Random().nextInt(r); i < Short.MAX_VALUE; i++){
            if (i % n == 0) list.add(i);
        }

        System.out.println(list);
    }
}
