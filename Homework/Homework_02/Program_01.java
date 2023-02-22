// Программа проверяет вхождение строк

package Homework.Homework_02;

import java.util.Scanner;

public class Program_01 {
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Введите 1 строку: ");
        StringBuilder str1 = new StringBuilder(scanner.nextLine());
        System.out.print("Введите 2 строку: ");
        StringBuilder str2 = new StringBuilder(scanner.nextLine());
        
        System.out.println(str1.toString().contains(str2)); //  вхождение одной строки в другую
        System.out.println(str1.toString().contains(str2.reverse())); //  вхождение в обратном порядке
    }
}
