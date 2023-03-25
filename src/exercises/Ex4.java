package exercises;

import java.util.Scanner;
import java.util.regex.*;

// Реализовать простой калькулятор
public class Ex4 {
    public static void run() {
        // Получаем ввод с клавиатуры
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите выражение вида \"x + y\". Допустимые операторы (через пробел): +, -, *, /: ");
        String var = scan.nextLine();
        // Ищем в строке первое и второе число
        String[] numbers = var.split("\\s[\\+\\-*\\/]\\s");
        // Ищем в строке оператор
        Pattern pattern = Pattern.compile("\\s[\\+\\-*\\/]\\s");
        Matcher matcher = pattern.matcher(var);
        String sign = matcher.find() ? matcher.group() : "?";
        System.out.print("Результат: ");
        switch (sign) {
            case " + ":
                System.out.println(Double.parseDouble(numbers[0]) + Double.parseDouble(numbers[1]));
                break;
            case " - ":
                System.out.println(Double.parseDouble(numbers[0]) - Double.parseDouble(numbers[1]));
                break;
            case " * ":
                System.out.println(Double.parseDouble(numbers[0]) * Double.parseDouble(numbers[1]));
                break;
            case " / ":
                System.out.println(Double.parseDouble(numbers[0]) / Double.parseDouble(numbers[1]));
                break;
            default:
                System.out.println("Ошибка!");
                break;
        }
    }
}
