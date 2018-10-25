import java.util.Arrays;

import static java.lang.Math.*;

public class TwodimArrayDouble {

    private double[][] m;

    TwodimArrayDouble(ArrayShort l, ArrayDouble x) {
        m = new double[l.length()][x.length()];
        short[] secAction = {3, 4, 7, 8, 9, 10, 12, 16, 18};
        for (int i = 0; i < l.length(); i++) {
            for (int j = 0; j < x.length(); j++) {
                if (l.getArray()[i] == 5) {
                    m[i][j] = pow((pow(0.25 / tan(x.getArray()[j]), 3)) / (2.0 / 3.0 - log(pow(2 * abs(x.getArray()[j]), 2))), cos(pow(x.getArray()[j], 1.0 / 3.0)));
                } else if (Arrays.binarySearch(secAction, l.getArray()[i]) >= 0) {
                    m[i][j] = pow((pow(pow(E, x.getArray()[j]), pow(E, x.getArray()[j]) / 4.0) * (4 * pow(cos(x.getArray()[j]) + 4, 2) + 1.0 / 4.0)), 2);
                } else {
                    m[i][j] = atan(1.0 / (pow(E, abs(sin(pow(E, x.getArray()[j])))))) * (pow(pow(pow(4.0 / x.getArray()[j], 2), 1.0 / 3.0), 2) + 1);
                }
            }
        }
    }

    public double[][] getArray() {
        return m;
    }
}
