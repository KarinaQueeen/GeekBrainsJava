// Программа присваивает i случайное целое число в диапазоне от 0 до 2000

package Homework.Homework_01;

import java.util.Random;

public class Program_01 {
    public static void main(String[] args) {
        int k = 2000;
        int i = new Random().nextInt(k); 
        
        System.out.println(i);
    }
}
