import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Homework43 {

    private static final Logger LOGGER = Logger.getLogger(Homework43.class.getName());

    private static List<Double> operands = new ArrayList<>();
    private static List<Character> operators = new ArrayList<>();

    public static void main(String[] args) {
        LOGGER.setLevel(Level.INFO);
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter expression:");
            String expression = scanner.nextLine();
            while (!expression.equals("exit")) {
                if (expression.equals("undo")) {
                    undo();
                } else {
                    try {
                        double result = calculate(expression);
                        LOGGER.info(expression + " = " + result);
                        System.out.println(result);
                    } catch (ArithmeticException e) {
                        LOGGER.warning("Division by zero: " + expression);
                        System.out.println("Division by zero");
                    } catch (Exception e) {
                        LOGGER.warning("Invalid expression: " + expression);
                        System.out.println("Invalid expression");
                    }
                }
                System.out.println("Enter expression:");
                expression = scanner.nextLine();
            }
        }
    }

    private static double calculate(String expression) throws Exception {
        operands.clear();
        operators.clear();
        double result = 0;
        boolean isNegative = false;
        boolean isDecimal = false;
        String number = "";
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (i == 0 && c == '-') {
                isNegative = true;
            } else if (i == 0 && c == '+') {
                continue;
            } else if (Character.isDigit(c)) {
                number += c;
                if (i == expression.length() - 1) {
                    double operand = Double.parseDouble(number);
                    if (isNegative) {
                        operand = -operand;
                        isNegative = false;
                    }
                    operands.add(operand);
                } else if (expression.charAt(i + 1) == '.' && !isDecimal) {
                    number += ".";
                    isDecimal = true;
                } else if (!Character.isDigit(expression.charAt(i + 1)) && expression.charAt(i + 1) != '.') {
                    double operand = Double.parseDouble(number);
                    if (isNegative) {
                        operand = -operand;
                        isNegative = false;
                    }
                    operands.add(operand);
                    isDecimal = false;
                    number = "";
                }
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                operators.add(c);
            } else {
                throw new Exception("Invalid character: " + c);
            }
        }
        if (operators.size() == 0) {
            return operands.get(0);
        }
        result = operands.get(0);
        for (int i = 0; i < operators.size(); i++) {
            char op = operators.get(i);
            double operand = operands.get(i + 1);
            if (op == '+') {
                result += operand;
            } else if (op == '-') {
                result -= operand;
            } else if (op == '*') {
                result *= operand;
            } else if (op == '/') {
                if (operand == 0) {
                    throw new ArithmeticException();
                }
                result /= operand;
            }
        }
        return result;
    }

    private static void undo() {
        if (operators.size() > 0) {
            operators.remove(operators.size() - 1);
            operands.remove(operands.size() - 1);
            operands.remove(operands.size() - 1);
            LOGGER.info("Undo last operation");
        }
    }
}