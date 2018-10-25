import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayShort l = new ArrayShort(); //Создаём массивы
        ArrayDouble x = new ArrayDouble();
        TwodimArrayDouble m = new TwodimArrayDouble(l, x);
        if (UserInput.toFileOut()) { //Выбираем способ вывода
            File file = new File(UserInput.outputFileInput());
            if (!file.exists()) {
                file.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(file);
            PrintStream ps = new PrintStream(fos);
            printer(ps, m);
        } else {
            printer(System.out, m);
        }
    }

    static void printer(PrintStream ps, TwodimArrayDouble m) { //Выводим итоговый массив
        for (int i = 0; i < m.getArray().length; i++) {
            for (int j = 0; j < m.getArray()[0].length; j++) {
                if (m.getArray()[i][j] >= 1000000000) {
                    double num = m.getArray()[i][j];
                    for (int k = 0; ; k++) {
                        if (num >= 10.0) {
                            num /= 10;
                        } else {
                            ps.print("   ");
                            if (k <= 1000) {
                                ps.print(" ");
                            }
                            if (k <= 100) {
                                ps.print(" ");
                            }
                            if (k <= 10) {
                                ps.print(" ");
                            }
                            ps.printf("%.3fE%d\t", num, k);
                            break;
                        }
                    }
                } else {
                    ps.printf("%13.3f\t", m.getArray()[i][j]);
                }
            }
            ps.println();
        }
    }
}
