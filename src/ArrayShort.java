import java.io.IOException;

public class ArrayShort {

    private short[] x;

    ArrayShort() {
        boolean correctInput = false;
        for (; !correctInput; ) {
            try {
                String userInput = UserInput.userInput();
                if (userInput.equals("a")) {
                    String[] numbers = UserInput.arrayInput().split(" ");
                    x = new short[numbers.length];
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
                    try {
                        x = new short[UserInput.arrayLength()];
                        for (short i = 1; i <= x.length; i++) {
                            x[i - 1] = i;
                        }
                        correctInput = true;
                    } catch (Exception e) {
                        System.out.println("Некорректный ввод");
                    }
                }
                if (userInput.equals("f")) {
                    String[] numbersF = UserInput.fileInput().split(" ");
                    x = new short[numbersF.length];
                    try {
                        for (int i = 0; i < numbersF.length; i++) {
                            x[i] = Short.parseShort(numbersF[i].trim());
                        }
                        correctInput = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Некорректный ввод");
                    }
                }
                if (userInput.equals("i")) {
                    x = new short[18];
                    for (short i = 1; i <= 18; i++) {
                        x[i - 1] = i;
                    }
                    correctInput = true;
                }
            } catch (IOException e) {
                System.out.println("Некорректный ввод");
            }
        }
    }

    public short[] getArray() {
        return x;
    }

    public int length() {
        return x.length;
    }
}
