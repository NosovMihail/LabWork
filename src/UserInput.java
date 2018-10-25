import java.io.*;
import java.util.Scanner;

public class UserInput {

    public static String userInput() {
        Scanner in = new Scanner(System.in);
        boolean correctIn = false;
        String input = "";
        for (; !correctIn; ) {
            System.out.println("Ввод массива, размера массива, файла с массивом или оставить значение по умолчанию? (a/l/f/i)");
            input = in.nextLine().trim().toLowerCase();
            if (input.equals("a") || input.equals("l") || input.equals("f") || input.equals("i")) {
                correctIn = true;
            } else {
                System.out.println("Некорректный ввод");
            }
        }
        return input;
    }

    public static String arrayInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите массив");
        return in.nextLine().trim();
    }

    public static int arrayLength() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длинну массива");
        return in.nextInt();
    }

    public static String fileInput() throws IOException {
        System.out.println("Введите название файла");
        Scanner in = new Scanner(System.in);
        String fileName = in.nextLine();
        BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
        String input = br.readLine().trim();
        br.close();
        return input;
    }

    public static String outputFileInput() {
        System.out.println("Введите название файла");
        Scanner in = new Scanner(System.in);
        String fileName = in.nextLine();
        return fileName.trim();
    }

    public static double[] userInterval() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите интервал генерации случайных чисел (два числа через пробел) или пробел, если хотите оставить значение по умолчанию");
        String[] interval = in.nextLine().split(" ");
        try {
            return new double[]{Double.parseDouble(interval[0].trim()), Double.parseDouble(interval[1].trim())};
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
            return new double[]{-14.0, 6.0};
        }
    }

    public static boolean toFileOut() {
        Scanner in = new Scanner(System.in);
        System.out.println("Вывести результат в файл? (y - да/n - нет)");
        for (boolean correct = true; correct; ) {
            String resp = in.nextLine().trim();
            if (resp.equals("y")) {
                return true;
            }
            if (resp.equals("n")) {
                return false;
            }
        }
        return false;
    }
}
