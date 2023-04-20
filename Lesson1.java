import java.time.LocalTime;
import java.util.Scanner;
import java.util.Random;

public class Lesson1 {

     public static void main(String[] args) {
    //     // string = "", char = ''
    //     // System.out.println(x: "Hello world!");
    //     // LocalDateTime time = LocalDateTime.now();
    //     // System.out.println(time);
    //     String encoding = System.getProperty("console.encoding", "utf-8");
    //     System.out.print("Введите имя ");
    //     Scanner iScanner = new Scanner(System.in, encoding);
    //     String name = iScanner.nextLine();
    //     // System.out.println(name);
    //     iScanner.close();
    //     System.out.println(vremya(name));
     }

    // В консоли запросить имя пользователя. В зависимости от текущего времени,
    // вывести приветствие вида
    // "Доброе утро, <Имя>!", если время от 05:00 до 11:59
    // "Добрый день, <Имя>!", если время от 12:00 до 17:59;
    // "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
    // "Доброй ночи, <Имя>!", если время от 23:00 до 4:59

    public static String vremya(String name) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
        String res = "";
        // isAfter <time < isBefore
        if (time.isAfter(LocalTime.of(5, 0)) && time.isBefore(LocalTime.of(11, 59))) {
            System.out.println("Доброе утро!");
            res = "Доброе утро!" + name;
        } else if (time.isAfter(LocalTime.of(12, 0)) && time.isBefore(LocalTime.of(17, 59))) {
            System.out.println("Добрый день!");
            res = "Добрый день!" + name;
        } else {
            System.out.println("Добрый вечер! " + name);
            res = "Добрый вечер! " + name;
        }
        return res;
    }

    /*
     * Дан массив двоичных чисел, например [1,1,0,1,1,1,1],
     * вывести максимальное количество подряд идущих 1.
     * Найти максимальное количество подряд идущих одинаковых элементов массива.
     * (постараться сделать с одним циклом)
     */

    public static void maxCount(int value) {
        int count = 0;
        int maxCount = 0;
        int[] math1 = fillMath();
        for (int i = 0; i < math1.length; i++) {
            if (math1[i] == value)
                count++;
            if (count > maxCount)
                maxCount = count;
            if (math1[i] != value)
                count = 0;

        }
        System.out.println(maxCount);
        printMath(math1);
    }

    public static int[] fillMath() {
        int[] math = new int[10];
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            math[i] = rand.nextInt(5);
        }
        return math;
    }

    public static void printMath(int[] math) {
        // for (int i = 0; i < math.length; i++) {
        // System.out.print(math[i] + ", ");
        // }

        for (int i : math) {
            System.out.print(i + ", ");
        }
    }

    /*
     * Дан массив nums = [3,2,1,2,3] и число val = 3.
     * Если в массиве есть числа, равные заданному, нужно перенести эти элементы в
     * конец массива.
     * Таким образом, первые несколько (или все) элементов массива должны быть
     * отличны от заданного, а остальные - равны ему.
     * [2,2,1,3,3]
     * [2,1,2,3,3]
     */
    public static int[] endElement(int num) {
        int[] nums = fillMath();
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num) {
                temp = nums[nums.length - i];
                nums[nums.length - i] = nums[i];
                nums[i] = temp;
            }
        }
        return nums;
    }

}
