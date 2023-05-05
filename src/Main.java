//import java.util.Arrays;
//import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Задачи блока Строки
        String strOutput, name = "Ivanov Ivan Ivanovich";
        System.out.println("\nЗадача № 1");
        strOutput = task1(name);
        System.out.println(strOutput);

        task2(name);

        name = "Иванов Семён Семёнович";
        task3(name);

        // Дополнительные Задачи блока Строки
        task4(name);
    }

    public static String task1(String inputName) {
        String lastName, firstName, middleName, blank = " ";

        String[] names = inputName.split(blank);
        lastName = names[0];
        firstName = names[1];
        middleName = names[2];

        StringBuilder fullName = new StringBuilder(lastName);
        fullName.append(blank + firstName);
        fullName.append(blank + middleName);

        return fullName.toString();
    }
    public static void task2(String fullName) {
        System.out.println("\nЗадача № 2");

        fullName=fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
    }
    public static void task3(String fullName) {
        System.out.println("\nЗадача № 3");
        fullName=fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }

    public static void task4(String fullName) {
        System.out.println("\nДоп. Задача № 4");
        System.out.println(fullName);
        int k = fullName.indexOf(" ");
        System.out.println(k);
        k = fullName.lastIndexOf(" ");
        System.out.println(k);
    }
    public static String stringFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя:");
        return scanner.nextLine();
    }
//    /**
//     * Метод для генерации массива заданной длины и разряда значений
//     *
//     * @param arrayLength -- длина массива
//     * @param segmentLength -- интервал генерируемых чисел
//     * @param segmentDisplace -- смещение интервала на величину +rightBound
//     * @return массив случайных чисел
//     */
//    public static int[] generateRandomArray(int arrayLength, int segmentLength, int segmentDisplace) {
//        java.util.Random random = new java.util.Random();
//        int[] arr   = new int[arrayLength];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(segmentLength)+segmentDisplace;
//        }
//        return arr;
//    }
}