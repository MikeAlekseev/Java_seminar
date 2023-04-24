import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        // Integer N = iScanner.nextInt();
        // System.out.println(sumString(N));
        // String defaultt = "aaaabbbcddacd";
        // String res = "";
        // for (int i = 0; i < defaultt.length(); i++){
        //     char s = defaultt.charAt(i);
        //     if (res.indexOf(s) == -1) res+=s;
        // }
        // System.out.println(res);
         
        StringBuilder name = new StringBuilder(iScanner.nextLine());
        StringBuilder namePalindrom = new StringBuilder(name);
        namePalindrom.reverse();
        // System.out.println(name.toString());
        // System.out.println(namePalindrom.toString());
        System.out.println(name.toString().equals(namePalindrom.toString()));
    }
//    public static String sumString(Integer N) {
//        /* Дано целое число N(>0) и символы c1 и с2.
//          * Написать метод, который вернет строку длины N, которая
//          * состоит из чередующихся символов c1 и c2, начиная с с1.
//          * N =5
//          * c1 = "Oleg"
//          * c2 = "Vasya"
//          * res = "OlegVasyaOlegVasyaOleg"
//          */
        
//         String c1 = "Oleg";
//         String c2 = "Vasya";
//         String res = "";
//         for (int i=0; i<N; i++){
//             if (i % 2 == 0) res+=c1;
//             else res+=c2;
//         }
//         return res; 
//    }

   public static void meth(String[] args) {
       /* Напишите метод6 который сжимает строку.
        * Пример: вход aaaabbbcddad.
        выход abcd
        charAt(i) и indexOf(s) => не найден -1
        */

   }

   public static void Task3(String[] args) {
       /* Напишите метод, который принимает на вход строку
        * (StringBulder) и определеяет является ли строка палиндромом
        (возвращает boolean значение).

        equals & StringBulder для revers
        */

   }
   public static void Task4(String[] args) {
       /* напишите метод, который составит строку, состоящую из 100
       повторений слова TEST и метод, который запишет эту строку в простой текстовый файл,
       оработайте исключения.
        */
        try(FileWriter fw = new FileWriter(fileName:"1.txt")){
            for (int i = 0; i < 100; i++) {
                fw.write("TEST");
                fw.append('\n');
            }
            fw.close();
        }catch(IOException ex) {
            System.out.println(ex.getMessage());      
        }
   }
}
