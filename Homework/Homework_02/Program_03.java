// Программа составляет строки: a + b = c   a – b = c   a * b = c и меняет символ “=” на слово “равно” двумя способами

package Homework.Homework_02;

import java.util.Scanner;

public class Program_03 {
   
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Введиту a: ");
        int a = scanner.nextInt();
        System.out.print("Введиту b: ");
        int b = scanner.nextInt();
        StringBuilder str = new StringBuilder();

        str
        .append(a +" + "+ b +" = " + (a+b) + "   ")
        .append(a +" - "+ b +" = " + (a-b) + "   ")
        .append(a +" * "+ b +" = " + (a*b));

        System.out.println(str);
   
        int index;
        while (str.toString().contains("=")){
            index = str.indexOf("=");
            str.deleteCharAt(index);
            str.insert(index, "равно");
        }
       
        System.out.println(str);
        System.out.println(str.toString().replace("=","равно"));
    }
}
