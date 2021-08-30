package org.itstep;

public class Homework1 {
    public static void main(String[] args) {

        /**   Задание 1. Мой вариант 9 - нечетные задания*/

//        1. Записать инструкцию, которая присваивает переменной x значение 1,5.
        float x = 1.5f;
        System.out.println("Задание1.1 x = " + (x));

//        3. Записать инструкцию, которая увеличивает на единицу значение переменной n.
        int n = 0;
        System.out.println("Задание1.3 " + ++n);

//        5. Написать инструкцию вычисления среднего арифметического переменных x1 и x2.
        double x1, x2, average;
        x1 = 4.120;
        x2 = 3.555;
        average = (x1 + x2) / 2;
        System.out.println("Задание1.5  Среднее арифметическое равно " + (average));

//        7. Написать инструкцию, которая увеличивает значение переменной t на величину, находящуюся в переменной dt.
        int t = 2, dt = 6;
        t += dt;
        System.out.println("Задание1.7 " + (t));

//        9. Записать в виде инструкции присваивания формулу пересчета расстояния из километров в версты (одна верста — 1066,8 м).
        double distance = 3.2; /** Значение расстояния в километрах */
        distance *= 1.0668;
        System.out.println("Задание1.9  Расстояние в вёрстах равно " + (distance));

//        11. Записать в виде инструкции присваивания формулу вычисления площади треугольника: s= a⋅h/2
        double sideTri, heightTri, squareTri;
        sideTri = 6.0;
        heightTri = 5.0;
        squareTri = sideTri * heightTri / 2;
        System.out.println("Задание1.11  Площадь треугольника равна " + squareTri);

//        13. Записать в виде инструкции присваивания формулу вычисления площади круга: s=π⋅r^2.
        double squareCircle, radius;
        radius = 1.5;
        squareCircle = Math.PI * Math.pow(radius, 2);
        System.out.println("Задание1.13  Площадь круга равна " + squareCircle);

//        15. Записать в виде инструкции присваивания формулу вычисления объема параллелепипеда.
        double volumePar, side_1 = 2.1, side_2 = 3.2, side_3 = 4.3;
        volumePar = side_1 * side_2 * side_3;
        System.out.println("Задание1.15  Объем параллелепипеда равен " + volumePar);

//        17. Записать в виде инструкции присваивания формулу вычисления объема цилиндра.
        double volumeCyl, radiusCyl, heightCyl;
        radiusCyl = 2.0;
        heightCyl = 3.6;
        volumeCyl = Math.PI * Math.pow(radiusCyl, 2) * heightCyl;
        System.out.println("Задание1.17  Объем цилиндра равен " + volumeCyl);

//        19. Записать в виде инструкции присваивания формулу вычисления объема конуса.
        double volumeCone, radiusCone, heightCone;
        radiusCone = 2.2;
        heightCone = 5.1;
        volumeCone = Math.PI * Math.pow(radiusCone, 2) * heightCone / 3;
        System.out.println("Задание1.19  Объем конуса равен " + volumeCone);

//        21. Записать в виде инструкции присваивания формулу для вычисления тока по известным значениям напряжения и сопротивления электрической цепи.
        float I, U = 3.3f, R = .1f;
        I = U / R;
        System.out.println("Задание1.21  Сила тока I равна " + I);



/**        Задание 2.*/

//        1. Загадать однозначное число в 10-тичной системе. Преобразовать его в двоичную и 16-ричную (в столбик).
        int i_1 = 6;
        System.out.println("Задание2.1.1    " + Integer.toBinaryString(i_1)); //преобразование в двоичнуюю систему
        System.out.println("Задание2.1.2    " + Integer.toHexString(i_1)); //преобразование в 16-ричную систему

//        2. Загадать двузначное число в 10-тичной системе. Преобразовать его в двоичную и 16-ричную.
        int i_2 = 63;
        System.out.println("Задание2.2.1    " + Integer.toBinaryString(i_2)); //преобразование в двоичнуюю систему
        System.out.println("Задание2.2.2    " + Integer.toHexString(i_2)); //преобразование в 16-ричную систему

//        3. Загадать 3-значное число в двоичной системе. Преобразовать его в десятичную и 16-ричную.
        int i_3 = 0b0000_0101;
        System.out.println("Задание2.3.1    " + i_3); //преобразование в 10-ричнуюю систему
        System.out.println("Задание2.3.2    " + Integer.toHexString(i_3)); //преобразование в 16-ричную систему

//        4. Загадать 6-значное число в двоичной системе. Преобразовать его в десятичную и 16-ричную.
        int i_4 = 0b0011_0101;
        System.out.println("Задание2.4.1    " + i_4); //преобразование в 10-ричнуюю систему
        System.out.println("Задание2.4.2    " + Integer.toHexString(i_4)); //преобразование в 16-ричную систему

//        5. Загадать 2-значное число в 16-ричной системе. Преобразовать его в двоичную и десятичную.
        int i_5 = 0xab;
        System.out.println("Задание2.5.1    " + Integer.toBinaryString(i_5)); //преобразование в двоичнуюю систему
        System.out.println("Задание2.5.2    " + i_5); //преобразование в 10-ричную систему

//        6. Загадать 4-значное число в 16-ричной системе. Преобразовать его в двоичную и десятичную.
        int i_6 = 0xabfc;
        System.out.println("Задание2.6.1    " + Integer.toBinaryString(i_6)); //преобразование в двоичнуюю систему
        System.out.println("Задание2.6.2    " + i_6); //преобразование в 10-ричную систему


    }
}
