import java.util.Scanner;
import java.util.*;

public class Main {

    public static void processIntegerBox(Box<Integer> box) {
        Integer value = box.get();
        System.out.println("Извлеченное значение из коробки: " + value);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("\nВыберите задачу:");
            System.out.println("1 - №1.1: Обобщенная коробка.");
            System.out.println("2 - №1.2: Без null.");
            System.out.println("3 - №2.2: Поиск максимума.");
            System.out.println("4 - №3.1: Функция.");
            System.out.println("5 - №3.2: Фильтр.");
            System.out.println("6 - №3.3: Сокращение.");
            System.out.println("7 - №3.4: Коллекционирование.");
            System.out.println("0 - Выход");
            System.out.print("Ваш выбор: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n==== Задание 1.1: Обобщенная коробка ====");

                    System.out.println("Выберите тип данных:");
                    System.out.println("1 - Целое число");
                    System.out.println("2 - Строка");
                    System.out.println("3 - Вещественное число");
                    System.out.print("Ваш выбор: ");

                    int userChoice = scanner.nextInt();
                    scanner.nextLine();

                    if (userChoice == 1) {
                        Box<Integer> box = new Box<>();

                        System.out.println("\n1. Проверка пустой коробки:");
                        System.out.println("Коробка пуста: " + !box.isFull());

                        System.out.print("\nВведите целое число: ");
                        int value1 = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("\n2. Кладем число в коробку:");
                        box.put(value1);
                        System.out.println("Коробка после помещения: " + box);
                        System.out.println("Коробка пуста: " + !box.isFull());

                        System.out.print("\nВведите второе целое число: ");
                        int value2 = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("\n3. Пытаемся положить второе число:");
                        try {
                            box.put(value2);
                            System.out.println("Успешно положили второе число");
                        } catch (IllegalStateException e) {
                            System.out.println("Ошибка: " + e.getMessage());
                        }

                        System.out.println("\n4. Извлекаем число из коробки:");
                        Integer result = box.get();
                        System.out.println("Извлекли: " + result);
                        System.out.println("Коробка после извлечения: " + box);
                        System.out.println("Коробка пуста: " + !box.isFull());

                    } else if (userChoice == 2) {
                        Box<String> box = new Box<>();

                        System.out.println("\n1. Проверка пустой коробки:");
                        System.out.println("Коробка пуста: " + !box.isFull());

                        System.out.print("\nВведите строку: ");
                        String value1 = scanner.nextLine();

                        System.out.println("\n2. Кладем строку в коробку:");
                        box.put(value1);
                        System.out.println("Коробка после помещения: " + box);
                        System.out.println("Коробка пуста: " + !box.isFull());

                        System.out.print("\nВведите вторую строку: ");
                        String value2 = scanner.nextLine();

                        System.out.println("\n3. Пытаемся положить вторую строку:");
                        try {
                            box.put(value2);
                            System.out.println("Успешно положили вторую строку");
                        } catch (IllegalStateException e) {
                            System.out.println("Ошибка: " + e.getMessage());
                        }

                        System.out.println("\n4. Извлекаем строку из коробки:");
                        String result = box.get();
                        System.out.println("Извлекли: " + result);
                        System.out.println("Коробка после извлечения: " + box);
                        System.out.println("Коробка пуста: " + !box.isFull());

                    } else if (userChoice == 3) {
                        Box<Double> box = new Box<>();

                        System.out.println("\n1. Проверка пустой коробки:");
                        System.out.println("Коробка пуста: " + !box.isFull());

                        System.out.print("\nВведите вещественное число: ");
                        double value1 = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.println("\n2. Кладем число в коробку:");
                        box.put(value1);
                        System.out.println("Коробка после помещения: " + box);
                        System.out.println("Коробка пуста: " + !box.isFull());

                        System.out.print("\nВведите второе вещественное число: ");
                        double value2 = scanner.nextDouble();
                        scanner.nextLine();

                        System.out.println("\n3. Пытаемся положить второе число:");
                        try {
                            box.put(value2);
                            System.out.println("Успешно положили второе число");
                        } catch (IllegalStateException e) {
                            System.out.println("Ошибка: " + e.getMessage());
                        }

                        System.out.println("\n4. Извлекаем число из коробки:");
                        Double result = box.get();
                        System.out.println("Извлекли: " + result);
                        System.out.println("Коробка после извлечения: " + box);
                        System.out.println("Коробка пуста: " + !box.isFull());

                    } else {
                        System.out.println("Неверный выбор");
                    }
                    break;

                case 2:
                    System.out.println("\n==== Задание 1.2: Без null ====");
                    scanner.nextLine();

                    System.out.println("\nХранилище чисел");


                    Integer number1 = Validator.inputIntegerWithNull(scanner, "Введите основное число: ");
                    Integer number2 = Validator.inputIntegerWithNull(scanner, "Альтернативное значение: ");
                    Storage<Integer> numberStorage1 = new Storage<>(number1, number2);

                    numberStorage1.printValue();
                    System.out.println("Информация: " + numberStorage1);

                    System.out.println("\nХранилище строк");

                    String string3 = Validator.inputStringWithNull(scanner, "Введите основную строку: ");
                    String string4 = Validator.inputStringWithNull(scanner, "Введите альтернативную строку: ");
                    Storage<String> stringStorage2 = new Storage<>(string3, string4);

                    stringStorage2.printValue();
                    System.out.println("Информация: " + stringStorage2);
                    break;

                case 3:
                    System.out.println("\n==== Задание 2.2: Поиск максимума ====");

                    java.util.List<Box<? extends Number>> boxes = new java.util.ArrayList<>();

                    System.out.println("Введите количество коробок с числами: ");
                    int boxCount = scanner.nextInt();
                    scanner.nextLine();

                    for (int i = 0; i < boxCount; i++) {
                        System.out.println("\nКоробка " + (i + 1) + ":");
                        System.out.println("Выберите тип числа:");
                        System.out.println("1 - Integer");
                        System.out.println("2 - Double");
                        System.out.println("3 - Float");
                        System.out.print("Ваш выбор: ");

                        int typeChoice = scanner.nextInt();
                        scanner.nextLine();

                        System.out.print("Введите число: ");

                        switch (typeChoice) {
                            case 1:
                                Box<Integer> intBox = new Box<>();
                                intBox.put(scanner.nextInt());
                                boxes.add(intBox);
                                break;
                            case 2:
                                Box<Double> doubleBox = new Box<>();
                                doubleBox.put(scanner.nextDouble());
                                boxes.add(doubleBox);
                                break;
                            case 3:
                                Box<Float> floatBox = new Box<>();
                                floatBox.put(scanner.nextFloat());
                                boxes.add(floatBox);
                                break;
                            default:
                                System.out.println("Неверный выбор, пропускаем эту коробку");
                                i--;
                                continue;
                        }
                        scanner.nextLine();
                    }

                    System.out.println("\nСозданные коробки:");
                    for (int i = 0; i < boxes.size(); i++) {
                        System.out.println("Коробка " + (i + 1) + ": " + boxes.get(i));
                    }

                    double maxValue = BoxUtils.findMaxValue(boxes);
                    System.out.println("Максимальное значение: " + maxValue);
                    break;

                case 4:
                    System.out.println("\n==== Задание 3.1: Функция ====");

                    System.out.println("\n--- 1. Строки -> Длины строк ---");
                    List<String> strings = Validator.inputStringList(scanner);
                    List<Integer> lengths = FunctionApply.apply(strings, String::length);
                    System.out.println("Исходные строки: " + strings);
                    System.out.println("Длины строк: " + lengths);

                    System.out.println("\n--- 2. Числа -> Абсолютные значения ---");
                    List<Integer> numbers = Validator.inputIntegerList(scanner);
                    List<Integer> absValues = FunctionApply.apply(numbers, Math::abs);
                    System.out.println("Исходные числа: " + numbers);
                    System.out.println("Абсолютные значения: " + absValues);

                    System.out.println("\n--- 3. Массивы -> Максимальные значения ---");
                    List<int[]> arrays = Validator.inputArraysList(scanner);
                    List<Integer> maxValues = FunctionApply.apply(arrays, arr -> {
                        int max = arr[0];
                        for (int value : arr) {
                            if (value > max) max = value;
                        }
                        return max;
                    });
                    System.out.println("Исходные массивы:");
                    for (int i = 0; i < arrays.size(); i++) {
                        System.out.println("  Массив " + (i + 1) + ": " + Arrays.toString(arrays.get(i)));
                    }
                    System.out.println("Максимальные значения: " + maxValues);
                    break;

                case 5:
                    System.out.println("\n==== Задание 3.2: Фильтр ====");

                    System.out.println("\n--- 1. Фильтрация коротких строк ---");
                    List<String> list1 = Validator.inputStringList(scanner);
                    List<String> filteredList1 = Filter.test(list1, str -> str.length() >= 3);
                    System.out.println("Исходные строки: " + list1);
                    System.out.println("Строки длиной >= 3: " + filteredList1);

                    System.out.println("\n--- 2. Фильтрация положительных чисел ---");
                    List<Integer> list2 = Validator.inputIntegerList(scanner);
                    List<Integer> posFilteredList2 = Filter.test(list2, x -> x > 0);
                    System.out.println("Исходные числа: " + list2);
                    System.out.println("Положительные числа: " + posFilteredList2);

                    System.out.println("\n--- 3. Фильтрация массивов без положительных элементов ---");
                    List<int[]> list3 = Validator.inputArraysList(scanner);
                    List<int[]> negFilteredList3 = Filter.test(list3, arr -> {
                        for (int num : arr) {
                            if (num > 0) return false;
                        }
                        return true;
                    });
                    System.out.println("Исходные массивы:");
                    for (int i = 0; i < list3.size(); i++) {
                        System.out.println("  Массив " + (i + 1) + ": " + Arrays.toString(list3.get(i)));
                    }
                    System.out.println("Массивы без положительных элементов: ");
                    for (int i = 0; i < negFilteredList3.size(); i++) {
                        System.out.println("  Массив " + (i + 1) + ": " + Arrays.toString(negFilteredList3.get(i)));
                    }
                    break;

                case 6:
                    System.out.println("\n==== Задание 3.3: Сокращение ====");

                    System.out.println("\n--- 1. Объединение строк ---");
                    List<String> strings1 = Validator.inputStringList(scanner);
                    String concatenated = Decrease.reduce(strings1, "", (s1, s2) -> s1 + s2);
                    System.out.println("Объединенная строка: " + concatenated);

                    System.out.println("\n--- 2. Сумма чисел ---");
                    List<Integer> integers = Validator.inputIntegerList(scanner);
                    Integer sum = Decrease.reduce(integers, 0, Integer::sum);
                    System.out.println("Сумма чисел: " + sum);

                    System.out.println("\n--- 3. Общее количество элементов ---");
                    List<int[]> listOfArrays = Validator.inputArraysList(scanner);
                    List<Integer> sizes = FunctionApply.apply(listOfArrays, arr -> arr.length);
                    Integer totalElements = Decrease.reduce(sizes, 0, Integer::sum);
                    System.out.println("Общее количество элементов: " + totalElements);
                    break;

                case 7:
                    System.out.println("\n==== Задание 3.4: Коллекционирование ====");

                    System.out.println("\n--- 1. Разделение чисел ---");
                    List<Integer> list4 = Validator.inputIntegerList(scanner);
                    List<Integer> positiveNumbers = Collections.collect(list4, ArrayList::new, num -> num > 0);
                    List<Integer> negativeNumbers = Collections.collect(list4, ArrayList::new, num -> num < 0);
                    System.out.println("Положительные: " + positiveNumbers);
                    System.out.println("Отрицательные: " + negativeNumbers);

                    System.out.println("\n--- 2. Группировка строк по длине ---");
                    List<String> list5 = Validator.inputStringList(scanner);
                    Set<Integer> lengthsSet = new HashSet<>();
                    for (String s : list5) lengthsSet.add(s.length());

                    Map<Integer, List<String>> groupedByLength = new HashMap<>();
                    for (Integer len : lengthsSet) {
                        List<String> group = Collections.collect(list5, ArrayList::new, str -> str.length() == len);
                        groupedByLength.put(len, group);
                    }
                    System.out.println("Строки по длине: " + groupedByLength);

                    System.out.println("\n--- 3. Уникальные строки ---");
                    List<String> list6 = Validator.inputStringList(scanner);
                    Set<String> uniqueStrings = Collections.collect(list6, HashSet::new, str -> true);
                    System.out.println("Уникальные строки: " + uniqueStrings);
                    break;

                case 0:
                    running = false;
                    System.out.println("До свидания!");
                    break;

                default:
                    System.out.println("Неверный выбор!");
            }
        }

        scanner.close();
    }
}