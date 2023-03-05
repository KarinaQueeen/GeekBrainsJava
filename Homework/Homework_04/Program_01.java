// Функционал программы: 
// 1. Ввод с консоли в формате фамилия, имя, отчетсво, возраст, пол (выход из режима ввода по горячей кнопке)
// 2. Вывод списка сортированного по возрасту (в формате Иванов И.И. 32M) или завершение приложения

package Homework.Homework_04;

import java.util.ArrayList;
import java.util.Scanner;


public class Program_01 {
    public static String[] scan() {

        System.out.println ("Введите данные или (-) для выхода");
        String[] str = {"Фамилия", "Имя", "Отчетсво", "Возраст", "Пол"};
        String[] people = new String[str.length];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < str.length; i++){
            System.out.println(str[i] + ":");
            String var = scanner.nextLine();
            if(var.equals("-")){
                break;
            }
            else{
                people[i] = var;
            }
        }

        if (people[0]!= null & people[1]!= null & people[2]!= null & people[3]!= null & people[4]!= null){
            return people;
        }
        return null;
    }
    public static void main(String[] args) {

        ArrayList<String[]> data = new ArrayList<>(); 
        String [] data_people = scan();
        if (data_people != null){
            data.add(data_people);
        }

        while (true){

            System.out.println("Выберите: 1. Добавить новые данные 2. Вывести отсортированные данные 3. Завершить работу с данными");
            Scanner scanner = new Scanner(System.in);
            int menu = scanner.nextInt();

            if ( menu == 1){
                data_people = scan();
                if (data_people != null){
                    data.add(data_people);
                }
            }

            if (menu == 2){

                int[] index = new int[data.size()];
                for (int i = 0; i< data.size(); i++){
                    index[i] = i;
                }

                int[] age = new int[data.size()];
                for (int i = 0; i< data.size(); i++){
                    age[i] = Integer.parseInt(data.get(i)[3]);
                }
                
                for (int l = 0; l < age.length-1; l++){
                    for (int i = 0; i<age.length-1; i++){
                        if(age[i]> age[i+1]) {
                            
                            int var = age[i];
                            age[i] = age[i+1];
                            age[i+1] = var;
                    
                            var = index[i];
                            index[i] = index[i+1];
                            index[i+1] = var;
                        }
                    }
                }
                
                for(int i = 0; i<index.length; i++){
                    System.out.println(data.get(index[i])[0] + " " + data.get(index[i])[1].charAt(0) + ". " + data.get(index[i])[2].charAt(0) + ". " + data.get(index[i])[3] + " " + data.get(index[i])[4].charAt(0)); 
                }
            }

            if (menu == 3){
                break;
            }
        }
    }
}
