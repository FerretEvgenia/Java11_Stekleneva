import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задача 1: Введите два целых числа:");
        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        System.out.println("Сложение: " + (a + b));
        System.out.println("Вычитание: " + (a - b));
        if (b != 0) {
            System.out.println("Деление: " + (a / b));
        } else {
            System.out.println("Деление: Деление на ноль невозможно");
        }
        System.out.println("Умножение: " + (a * b));
    }
}

