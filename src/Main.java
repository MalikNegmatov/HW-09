import java.util.Arrays;

public class Main {

    public static String inputName = "Ivanov Ivan Ivanovich";
    public static String blank = " ";

    public static void main(String[] args) {
        // Задачи блока Строки
        String strOutput;
        System.out.println("\nЗадача № 1");
        strOutput = task1(inputName);
        System.out.println(strOutput);

        task2(inputName);
        task3("Иванов Семён Семёнович");

        // Дополнительные Задачи блока Строки
        task4(inputName);
        task5("ivanov ivan ivanovich");
        task6("135", "246");
        task6("ABC", "abc");
        task7("aabccddefgghiijjkk");
        task7("dkfglbsdlkjfghsdiufiffkjgnlsd");
    }

    public static String task1(String inputName) {
        String lastName, firstName, middleName, fullName;

        String[] names = inputName.split(blank);
        lastName = names[0];
        firstName = names[1];
        middleName = names[2];

        fullName = lastName + blank + firstName +
                blank + middleName;

        return fullName;
    }

    public static void task2(String fullName) {
        System.out.println("\nЗадача № 2");

        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
    }

    public static void task3(String fullName) {
        System.out.println("\nЗадача № 3");
        fullName = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — " + fullName);
    }

    public static void task4(String fullName) {
        System.out.println("\nДоп. Задача № 4");

        String lastName = fullName.substring(0, fullName.indexOf(blank));
        System.out.println(lastName);

        String firstName = fullName.substring(fullName.indexOf(blank) + 1, fullName.lastIndexOf(blank));
        System.out.println(firstName);

        String middleName = fullName.substring(fullName.lastIndexOf(blank) + 1);
        System.out.println(middleName);
    }

    public static void task5(String fullName) {
        System.out.println("\nДоп. Задача №5");

        String[] names = fullName.split(blank);
        String lastName = names[0];
        String firstName = names[1];
        String middleName = names[2];

        lastName = lastName.substring(0, 1).toUpperCase() +
                lastName.substring(1).toLowerCase();
        System.out.println(lastName);

        firstName = firstName.substring(0, 1).toUpperCase() +
                firstName.substring(1).toLowerCase();
        System.out.println(firstName);

        middleName = middleName.substring(0, 1).toUpperCase() +
                middleName.substring(1).toLowerCase();
        System.out.println(middleName);
    }

    public static void task6(String firstString, String secondString) {
        System.out.println("\nДоп. Задача № 6");

        StringBuilder finalString = new StringBuilder();

        for (int i = 0; i < firstString.length(); i++) {
            finalString.append(firstString.charAt(i)).append(secondString.charAt(i));
        }
        System.out.println(finalString);
    }

    public static void task7(String inputString) {
        System.out.println("\nДоп. Задача № 7");
        String outputString="";
        char[] charArray = inputString.toCharArray();
        Arrays.sort(charArray);
        inputString = new String(charArray);

        int j, i = 0;

        while (i < inputString.length()){
            j = inputString.lastIndexOf(inputString.charAt(i));
            if ( j - i > 0 ) {
                outputString = String.format("%s%s", outputString, inputString.charAt(i));
                i = j + 1;
            }
            else {
                i++;
            }
        }
        System.out.println(outputString);
    }
}

/*
    public static String stringFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваше имя:");
        return scanner.nextLine();
    }
    /**
     * Метод для генерации массива заданной длины и разряда значений
     *
     * @param arrayLength -- длина массива
     * @param segmentLength -- интервал генерируемых чисел
     * @param segmentDisplace -- смещение интервала на величину +rightBound
     * @return массив случайных чисел
     * /
    public static int[] generateRandomArray(int arrayLength, int segmentLength, int segmentDisplace) {
        java.util.Random random = new java.util.Random();
        int[] arr   = new int[arrayLength];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(segmentLength)+segmentDisplace;
        }
        return arr;
    }
*/