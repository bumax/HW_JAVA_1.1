import exercises.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Получаем ввод с клавиатуры
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите номер задания: ");
        int ex = scan.nextInt();
        switch (ex) {
            case 1:
                Ex1.run();
                break;
            case 2:
                Ex2.run();
                break;
            case 3:
                Ex3.run(1000);
                break;
            case 4:
                Ex4.run();
                break;
        }
    }
}