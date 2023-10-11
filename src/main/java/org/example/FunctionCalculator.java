package org.example;

public class FunctionCalculator {
    public static double calculate(double a, double b, int n, int m) throws Exception {
        if (a % 1 != 0 || b % 1 != 0){
            throw new Exception("Error: Indexes must be integer");
        }
        double result = 0.0;

        if(a > n || b > m){
            return 0.0;
        }

        for (double i = a; i <= n; i++) {
            for (double j = b; j <= m; j++) {
                if (j != 0 && i != 2) {
                    double value = i / j/ (i - 2);
                    result += value;
                }
            }
        }
    return result;
    }
}
