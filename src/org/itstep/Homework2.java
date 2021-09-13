package org.itstep;

public class Homework2 {
    public static void main(String[] args) {
        /*Задание 1. Обнулить бит в нулевом разряде числа N. Остальные
        биты не должны изменить свое значение. Вывести на консоль в двоичном виде.*/
            byte n1 = 0b1111;
            byte result1 = (byte) (~1 & n1);
            System.out.println("Task1: Modified number is " + Integer.toBinaryString(result1));

        /*Задание 2. Вывести на консоль 2 в степени n. Для вычисления ис-
          пользовать только побитовые операции. */
            int n2 = 15;
            int result2 = (1 << n2);
            System.out.println("Task2: 2 в степени " + (n2) + " равняется: " + (result2));

        /*Задание 3. Установить i-й бит числа N равным 1. Вывести результат
          на консоль в двоичном виде.*/
            byte n3 = 0b1101;
            byte i3=4;
            byte result3 = (byte) ((1 << i3) | n3);
            System.out.println("Task3: Modified number is "+ Integer.toBinaryString(result3));

        /*Задание 4. Инвертировать i-й бит числа N. Вывести результат на
          консоль в двоичном виде.*/
            byte n4 = 0b1001;
            byte i4=2;
            byte result4 = (byte) ((1 << i4) ^ n4);
            System.out.println("Task4: Modified number is "+ Integer.toBinaryString(result4));

        /*Задание 5. Установить i-й бит числа N равным 0. Вывести результат
          на консоль в двоичном виде.*/
            byte n5 = 0b1101;
            byte i5=2;
            byte result5 = (byte) (~(1 << i5) & n5);
            System.out.println("Task5: Modified number is "+ Integer.toBinaryString(result5));

        /*Задание 6. Обнулить все кроме последних i битов числа N. Вывести
        результат на консоль в двоичном виде.*/
            byte n6 = 0b110_1101;
            byte i6=3;
            byte result6 = (byte) ((n6 >> 8-i6) << 8-i6);
            System.out.println("Task6: Modified number is "+ Integer.toBinaryString(result6));

        /*Задание 7. Определить значение i-го бита числа N. Вывести резуль-
          тат на консоль в двоичном виде.*/
            byte n7 = 0b1010101;
            byte i7=4;
            byte result7 = (byte) ((1 << i7) & n7);
            if (result7 == 0) System.out.println("Task7: Значение "+i7+"-го бита числа " + Integer.toBinaryString(n7)+ " равняется 0");
            else System.out.println("Task7: Значение "+i7+"-го бита числа " + Integer.toBinaryString(n7)+ " равняется 1");

        /*Задание 8. Обнулить крайний левый (старший разряд) единичный
        бит числа N. Вывести результат на консоль в двоичном виде.*/
            byte n8 = 0b111;
            byte result8 = (byte) (1 << 6);
            while (result8 > n8) {
                result8>>=1;
                n8 = (byte) (n8 ^ result8);
            }
            System.out.println("Task7: Значение "+result8+"-го бита числа " + Integer.toBinaryString(n8)+ " равняется 1");




    }

}
