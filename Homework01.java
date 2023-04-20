import java.util.Scanner;

public class Homework01 {

    // public static void main(String[] args) {
    //     // Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    //     Scanner iScanner = new Scanner(System.in);
    //     System.out.println("Введите число: ");
    //     int num = iScanner.nextInt();
    //     System.out.println("Треугольное число: " + trianNum(num));
    //     iScanner.close();
    // }

    // public static int trianNum(int n) {
    //     return (n * (n + 1)) / 2;
    // }

    // public static void main(String[] args) {
    //     // Вывести все простые числа от 1 до 1000
    //     for (int i = 2; i <= 1000; i++) {
    //         boolean isPrime = true;
    //         for (int j = 2; j < i; j++) {
    //             if (i % j == 0) {
    //                 isPrime = false;
    //                 break;
    //             }
    //         }
    //         if (isPrime) {
    //             System.out.print(i + " ");
    //         }
    //     }
    // }

        public static void main(String[] args) {
            // Реализовать простой калькулятор
            Scanner input = new Scanner(System.in);
            float num1, num2, result;
            char operator;
            System.out.println("Введите первое число:");
        num1 = input.nextFloat();

        System.out.println("Введите оператор (+, -, *, /):");
        operator = input.next().charAt(0);

        System.out.println("Введите второе число:");
        num2 = input.nextFloat();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Результат: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Результат: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Результат: " + result);
                break;

            case '/':
                if (num2 == 0) {
                    System.out.println("Ошибка! Деление на ноль.");
                } else {
                    result = num1 / num2;
                    System.out.println("Результат: " + result);
                }
                break;

            default:
                System.out.println("Ошибка! Неверный оператор.");
                break;
        }

        input.close();
    }
}

