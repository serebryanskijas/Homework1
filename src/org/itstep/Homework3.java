package org.itstep;

import java.util.Arrays;
//import java.util.Random;

public class Homework3 {
    static double[] arr = new double[10];

    public static void main(String[] args) {
        System.out.printf("%n********** Задание№1 (Вариант 2.10) **********%n");
        System.out.println();
        calculations();

        System.out.printf("%n********** Задание№2 (Вариант 4.10) **********%n");
        //double[] arr = new double[]{1.1, 2.2, 3.3, 1.2}; // для проверки
        System.out.println();
        fillRandom();
        double n = 14.75;
        System.out.println("Случайный массив из 10 элементов - " + Arrays.toString(arr));
        arrayTask(n, arr);

    }

    public static void calculations() {

        // x/3! - x^3/5! + x^5/7!...+-(x^(2*i-1))/(2*i+1)!
        double x = 0.4, a = x, sum = 0, eps = 1e-10;
        int num = 1;
        boolean znak = true;
        while (Math.abs(a) > eps) {
            a = stepen(x, 2 * num - 1) / factorial(2 * num + 1);
            if (!znak) {
                sum -= a;
                znak = true;
            } else {
                sum += a;
                znak = false;
            }
            num++;
        }
        double res = (x - Math.sin(x)) / Math.pow(x, 2);

        System.out.printf("Контрольная проверка " + res + "%nЗначение из цикла    " + sum + "%n");
    }

    static double stepen(double a, double n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= a;
        }
        return result;
    }

    static double factorial(double n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }


    public static void arrayTask(double num, double[] arr) {
// Найти 2 числа из массива, среднее арифметическое которых будет ближе по значению к заданному числу n.
        double[] arr1 = new double[2];
        double aver;
        double avg = Math.abs(num-(arr[0] + arr[1]) / 2.0);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                aver = (arr[i] + arr[j]) / 2.0; // среднее арифметическое значение
                if (avg >= Math.abs(num-aver)) {
                    avg = Math.abs(num-(arr[i] + arr[j]) / 2.0);
                    arr1[0] = arr[i];
                    arr1[1] = arr[j];
                }
                /*if ((aver - num) == 0 || Math.abs(aver - num) < ogranichenie) {
                 *//*если разница ср.арифм. и заданного числа равна нулю
                    или разница меньше 0,1, то присваиваем новому массиву значения элементов из заполненного массива.*//*
                    arr1[0] = arr[i];
                    arr1[1] = arr[j];
                }
                else ogranichenie +=0.1;*/ //увеличение ограничения на 0,1 в случае если разница больше
            }
        }
        System.out.printf("Заданное число = %.2f%nЧисло №1 = %.4f, Число №2 = %.4f%nСреднее арифметическое найденных чисел = %.4f%n", num, arr1[0], arr1[1], (arr1[0] + arr1[1]) / 2);
    }

    public static void fillRandom() {
        //Заполнение массива случайными числами до 30 !!!
        //Random random = new Random();
        //double[] arr = new double[10]; // для проверки
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Math.random() * 30);
        }
    }
}
