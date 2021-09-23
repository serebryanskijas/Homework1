package org.itstep;

import java.util.Arrays;
import java.util.Random;

public class Homework3 {
    static double[] arr = new double[10];

    public static void main(String[] args) {
        System.out.printf("%n********** Задание№1 (Вариант 2.10) **********%n");
        System.out.println();
        calculations();

        System.out.printf("%n********** Задание№2 (Вариант 4.10) **********%n");
        System.out.println();
        fillRandom();
        double n = 11.12;
        System.out.println("Случайный массив из 10 элементов - "+Arrays.toString(arr));
        arrayTask(n, arr);

    }

    public static void calculations() {

        // x/3! - x^3/5! + x^5/7!...+-(x^(2*i-1))/(2*i+1)!
        double x = 0.4, a = x, sum = 0, eps = 1e-10;
        int num = 1;
        boolean znak = true;
        while (Math.abs(a) > eps) {
            a = chislitel(x, 2 * num - 1) / znaminatel(2 * num + 1);
            if (!znak) {sum -=a; znak=true;}
            else {sum+=a; znak = false;}
            num++;
        }
        double res = (x - Math.sin(x)) / Math.pow(x, 2);

        System.out.printf("Контрольная проверка " + res + "%nЗначение из цикла    " + sum + "%n");
    }

    static double chislitel(double a, double n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= a;
        }
        return result;
    }

    static double znaminatel(double n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }


    public static void arrayTask(double num, double[] arr) {

        double[] arr1 = new double[2];
        double aver;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                aver = (arr[i] + arr[j]) / 2; // среднее арифметическое значение
                if ((aver - num) == 0 || Math.abs(aver - num) <= 0.5) {
                    /*если разница ср.арифм. и заданного числа равна нулю,
                    то присваиваем новому массиву значения элементов из заполненного массива.
                    или если разница меньше или равна 0,5 то присваиваем новому массиву значения элементов из заполненного массива.
                    если бы смог заполнить массив значениями с плавающей точкой рандомно, тогда в условии или можно было бы поставить < 0.2 например
                    т.к. не из целых чисел среднее арифметическое было бы разным значением, а не как сейчас либо целое, либо число с 0,5*/
                    arr1[0] = arr[i];
                    arr1[1] = arr[j];
                }
            }
        }
        System.out.printf("Заданное число = %.2f%nСреднее арифметическое найденных чисел= %.2f%nЧисло №1 = %.1f, Число №2 = %.1f", num, (arr1[0] + arr1[1]) / 2, arr1[0], arr1[1]);
        }

    public static void fillRandom() {
        //Заполнение массива случайными числами от 5 до 25 !!!(не получилось заполнить значениями типа double)!!!
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(20)+5;
        }
    }
}
