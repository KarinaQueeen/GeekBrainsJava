// Программа сравнивает время выполнения Program_03.java со строкой содержащей более 10000 "=" (String as StringBuilder)

package Homework.Homework_02;

public class Program_04 {
    public static void main(String[] args) {
                
        long begin = System.currentTimeMillis();  
        String str1 = ""; 
        for (int i = 0; i < 10000; i++) {
            str1 += "a + b = c";
            str1 += "a - b = c";
            str1 += "a * b = c";
        }
        long end = System.currentTimeMillis(); 
        System.out.println(end - begin);
              
        begin = System.currentTimeMillis();  
        StringBuilder str2 = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            str2.append("a + b = c").append("a - b = c").append("a * b = c");
        }
        end = System.currentTimeMillis(); 
        System.out.println(end - begin);
    }
}
