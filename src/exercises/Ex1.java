package exercises;

import java.util.Scanner;

//Вычислить n-ое треугольного число (сумма чисел от 1 до n),
public class Ex1 {
    public static void run() {
//        Получаем ввод с клавиатуры
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {
            int t = 1; // инициализируем T
            // Печатаем заголовок который всегда начинается с Tn = 1...
            System.out.print("T" + i + " = 1");
            // Выводим все числа, которые мы суммируем, исключая 1
            for (int j = 2; j <= i; j++) {
                t += j;
                System.out.print(" + " + j);
            }
            // Вывод непосредственно значения
            System.out.println(" = " + t);
            // для самоконтроля: System.out.println(" = " + i * (i + 1) / 2);
        }
    }

}
