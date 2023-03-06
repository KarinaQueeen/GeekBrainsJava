// Программа иммитирует поведение коллекции HashSet (организованны методы add, toString, get)

package Homework.Homework_06;

import java.util.HashMap;

public class Program_01 {
    public static void main(String[] args) {
        
        MySet set = new MySet();
        set.add(1);
        set.add(5);
        set.add(7);
        set.add(7);
        set.add(9);

        System.out.println(set.toString());
        System.out.println(set.get(0));
    }
}

class MySet {
            
    HashMap<Integer, Object> values = new HashMap<>();
    private static final Object X = new Object(); 
    
    void add(int data){
        values.put(data, X);
    }

    public String toString(){
        return values.keySet().toString();
    }

    int get(int index){
        return (int) values.keySet().toArray()[index];
    }
}



