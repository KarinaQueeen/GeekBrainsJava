// Программа создает два множества (ключ: значение) из шести элементов и выводит в консоль. Добавляет ко всем элементам из 1 множества символ "!". Объеденяет значения элементов из множеств если ключи совподают 

package Homework.Homework_05;

import java.util.HashMap;

public class Program_01 {
    public static void main(String[] args) {
        
        HashMap<Integer, String> hashMap1 = new HashMap<>();
        hashMap1.put(0, "A"); 
        hashMap1.put(1, "B"); 
        hashMap1.put(2, "C"); 
        hashMap1.put(3, "D"); 
        hashMap1.put(4, "E"); 
        hashMap1.put(5, "F"); 

        HashMap<Integer, String> hashMap2 = new HashMap<>();
        hashMap2.put(0, "A"); 
        hashMap2.put(2, "C"); 
        hashMap2.put(4, "E"); 
        hashMap2.put(6, "G"); 
        hashMap2.put(8, "I"); 
        hashMap2.put(10, "K"); 

        hashMap1.forEach((k, v) -> System.out.print(k + ":" + v + "   "));
        System.out.println();
        hashMap2.forEach((k, v) -> System.out.print(k + ":" + v + "   "));
        System.out.println();
        System.out.println("-".repeat(40));

        for (int i = 0; i < hashMap1.keySet().size(); i++){
            hashMap1.compute(i, (k, v) -> v += "!");
        }

        hashMap1.forEach((k, v) -> System.out.print(k + ":" + v + "   "));
        System.out.println();
        System.out.println("-".repeat(40));
        
        HashMap<Integer, String> hashMap3 = new HashMap<>();
        for (Integer key : hashMap1.keySet()) {
            if (hashMap2.get(key) != null){
                hashMap3.put(key, hashMap1.get(key) + hashMap2.get(key));
            }
        }
        hashMap3.forEach((k, v) -> System.out.print(k + ":" + v + "   "));
    }
}
