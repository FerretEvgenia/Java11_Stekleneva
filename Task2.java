import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Задача 2: Введите две строки:");
        System.out.print("Строка a: ");
        String a = scanner.nextLine();
        System.out.print("Строка b: ");
        String b = scanner.nextLine();

        if (a.equals(b)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
    }
}
