//import java.util.Arrays;
//import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Задачи блока Строки
        task1(false);
        //task1(true);

    }

    public static void task1(boolean flag) {
        System.out.println("\nЗадача № 1");
        String inputName, lastName, firstName, middleName;

        if (flag) {
            inputName = stringFromConsole();
        }
        else {
            inputName = "Ivanov Ivan Ivanovich";
        }

        String[] names = inputName.split(" ");
        lastName = names[0];
        firstName = names[1];
        middleName = names[2];

        StringBuilder fullName = new StringBuilder(lastName);
        fullName.append(" " + firstName);
        fullName.append(" " + middleName);

        System.out.println(fullName);
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