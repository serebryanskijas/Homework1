package org.itstep;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {
        calculations();

        double[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double n = 4.2;
        System.out.println(Arrays.toString(arr));
        arrayTask(n,arr);
    }

    public static void calculations() {
        
        // x/3! - x^3/5! + x^5/7!
        double x = 1, a = x, sum = 0, eps = 1e-10, chis = 1, znam = 1;
        int num = 1;
        while (Math.abs(a) > eps) {
            sum = sum + a;
            num++;

            for (int i = 1; i <= (2 * num - 1); i++) {
                chis *= a;

            }
            System.out.println(chis);
            for (int i = 1; i <= (2 * num + 1); i++) {
                znam *= i;
                //System.out.println(znam);
            }
            a *= -x * chis / znam;
        }
        double res = Math.sin(Math.toRadians(x)); //res=3*Math.pow(1+x,1./3)-3;
        System.out.println("контрольная проверка " + res + " Значение из цикла " + sum);
    }

    public static void arrayTask(double num, double[] arr ) {

        double[] arr1 = new double[2];
        double aver;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                aver = (arr[i] + arr[j]) / 2;
                if ((aver - num) == 0 || Math.abs(aver - num) < 0.5) {
                    arr1[0]=arr[i];
                    arr1[1] = arr[j];
                }
            }
        }
        System.out.printf("Number = %.4f, element 1 = %.4f, element 2 = %.4f, average= %.4f", num, arr1[0], arr1[1],
                (arr1[0] + arr1[1]) / 2);
    }
}
