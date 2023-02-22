// Программа переворачивает строку с помощью рекурсии

package Homework.Homework_02;

import java.util.Scanner;

public class Program_02 {

    public static StringBuilder metod(StringBuilder str1,StringBuilder str2) {
        
        if (str1.length()==0){
            return str2;
        }
        str2.append(str1.charAt(str1.length()-1));
        str1.deleteCharAt(str1.length()-1);
        return metod(str1, str2);
    } 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Введиту a: ");
        StringBuilder str = new StringBuilder(scanner.nextLine());
        System.out.print(metod(str, new StringBuilder("")));
    }
}
