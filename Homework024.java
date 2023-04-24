import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

// К калькулятору из предыдущего дз добавить логирование.

public class Homework024 {
    private static final Logger LOGGER = Logger.getLogger(Homework024.class.getName());
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1, num2, result;
        char operator;
        LOGGER.log(Level.INFO, "Введите первое число:");
        num1 = input.nextFloat();
        LOGGER.log(Level.INFO, "Введите оператор (+, -, *, /):");
        operator = input.next().charAt(0);
        LOGGER.log(Level.INFO, "Введите второе число:");
        num2 = input.nextFloat();
    
        switch (operator) {
            case '+':
                result = num1 + num2;
                LOGGER.log(Level.INFO, "Результат: " + result);
                break;
    
            case '-':
                result = num1 - num2;
                LOGGER.log(Level.INFO, "Результат: " + result);
                break;
    
            case '*':
                result = num1 * num2;
                LOGGER.log(Level.INFO, "Результат: " + result);
                break;
    
            case '/':
                if (num2 == 0) {
                    LOGGER.log(Level.SEVERE, "Ошибка! Деление на ноль.");
                } else {
                    result = num1 / num2;
                    LOGGER.log(Level.INFO, "Результат: " + result);
                }
                break;

            default:
                LOGGER.log(Level.SEVERE, "Ошибка! Неверный оператор.");
                break;
        }
        input.close();
    }
}
