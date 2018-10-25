import java.io.IOException;

public class ArrayDouble {

    private double[] x;

    ArrayDouble() {
        boolean correctInput = false;
        for (; !correctInput; ) {
            try {
                String userInput = UserInput.userInput();
                if (userInput.equals("a")) {
                    String[] numbers = UserInput.arrayInput().split(" ");
                    x = new double[numbers.length];
                    try {
                        for (int i = 0; i < numbers.length; i++) {
                            x[i] = Short.parseShort(numbers[i].trim());
                        }
                        correctInput = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Некорректный ввод");
                    }
                }
                if (userInput.equals("l")) {
                    x = new double[UserInput.arrayLength()];
                    double[] interval = UserInput.userInterval();
                    for (short i = 0; i < x.length; i++) {
                        x[i] = Math.random() * (interval[1] - interval[0]) + interval[0];
                    }
                    correctInput = true;
                }
                if (userInput.equals("f")) {
                    try {
                        String[] numbersF = UserInput.fileInput().split(" ");
                        x = new double[numbersF.length];
                        for (int i = 0; i < numbersF.length; i++) {
                            x[i] = Short.parseShort(numbersF[i].trim());
                        }
                        correctInput = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Некорректный ввод");
                    }
                }
                if (userInput.equals("i")) {
                    x = new double[20];
                    double[] interval = UserInput.userInterval();
                    for (short i = 0; i < x.length; i++) {
                        x[i] = Math.random() * (interval[1] - interval[0]) + interval[0];
                    }
                    correctInput = true;
                }
            } catch (IOException e) {
                System.out.println("Некорректный ввод");
            }
        }
    }

    public double[] getArray() {
        return x;
    }

    public int length() {
        return x.length;
    }
}
