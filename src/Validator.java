import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Validator {
    public static List<String> inputStringList(Scanner scanner) {
        System.out.print("Введите количество строк: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            list.add(scanner.nextLine());
        }
        return list;
    }

    public static List<Integer> inputIntegerList(Scanner scanner) {
        System.out.print("Введите количество чисел: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            System.out.print("Число " + (i + 1) + ": ");
            list.add(scanner.nextInt());
        }
        scanner.nextLine();
        return list;
    }

    public static List<int[]> inputArraysList(Scanner scanner) {
        System.out.print("Введите количество массивов: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        List<int[]> arrays = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            System.out.print("Количество элементов в массиве " + (i + 1) + ": ");
            int size = scanner.nextInt();
            int[] array = new int[size];
            for (int j = 0; j < size; j++) {
                System.out.print("Элемент " + (j + 1) + ": ");
                array[j] = scanner.nextInt();
            }
            arrays.add(array);
            scanner.nextLine();
        }
        return arrays;
    }

    public static Integer inputIntegerWithNull(Scanner scanner, String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine().trim();
        if (input.isEmpty() || input.equalsIgnoreCase("null")) {
            return null;
        }
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введите целое число или 'null'");
            return inputIntegerWithNull(scanner, prompt);
        }
    }

    public static String inputStringWithNull(Scanner scanner, String prompt) {
        System.out.print(prompt);
        String input = scanner.nextLine().trim();
        if (input.isEmpty() || input.equalsIgnoreCase("null")) {
            return null;
        }
        return input;
    }

    public static int inputPositiveInteger(Scanner scanner, String prompt) {
        System.out.print(prompt);
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }
}