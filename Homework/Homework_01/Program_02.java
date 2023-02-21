// Программа присваивает n номер старшего значащего бита случайного числа

package Homework.Homework_01;

import java.util.Random;

public class Program_02 {
    public static void main(String[] args) {
        int k = 2000;
        int i = new Random().nextInt(k); 
        
        System.out.println(i);
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(i).length());
    }
}
