package exercises;

import java.util.Scanner;

// Вычислить n! (произведение чисел от 1 до n)
public class Ex2 {
    public static void run() {
        // Получаем ввод с клавиатуры
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scan.nextInt();
        // Печатаем значение
        System.out.printf("%d! = %d", n, factorial(n));
    }

    private static long factorial(int n) {
        if (n <= 1) return 1;
        // Рекурсия - она и в Африке рекурсия :-)
        return n * factorial(n - 1);
    }
}
