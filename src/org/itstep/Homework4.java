package org.itstep;

import java.util.Arrays;
import java.util.Random;

public class Homework4 {
    static int[] arr = new int[10];

    public static void main(String[] args) {
        System.out.println("Task 4.1.10: Определить пропущенные числа в массиве, элементы которого не повторяются.");
        fillRandom();
        findNumbers();
        System.out.println('\n' + " ");


        System.out.println("Task 4.2.10: Pattern 28");
        int count = 1;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j < count+1; j++) {
            int sum = j;
                sum *= i;
                System.out.print(sum + " ");
            }
            count++;
            if (count>4) { //Тут я подвис, не доходит как счетчик уменьшить...
                count-=2;
            }
            System.out.println();
        }

    }

    public static void fillRandom() {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(30);
        }
    }

    static void findNumbers() {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Пропущенные числа данного массива:");
        for (int i = arr[0]; i <= arr[arr.length - 1]; i++) {
            int index = Arrays.binarySearch(arr, i);
            if (index < 0) System.out.print(i + ", ");
        }
    }
}
