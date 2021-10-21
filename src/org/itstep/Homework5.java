package org.itstep;

import java.io.FilenameFilter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;


public class Homework5 {
    public static void main(String[] args) throws IOException {
        //Задача 1. Из исходного слова путем «вырезок» и «склеек» его подстрок получить другие слова:
        System.out.println("\n1.4. компилятор: импорт, компот.");
        String s = "компилятор";
        char[] result = s.toCharArray();
        char[] result1 = {result[4],result[2],result[3],result[1],result[9],result[7]};
        s = new String(result1);
        System.out.println(s);
        char[] result2 = {result[0],result[1],result[2],result[3],result[8],result[7]};
        s = new String(result2);
        System.out.println(s);


        //Задача 2. Дано предложение.
        System.out.println("\n2.4. Дано предложение. Заменить в нем все вхождения буквосочетания да на не.\n");
        s = "Вы готовы, дети?.. (Да)\n" +
                "Есть в кастрюле пять котлет.\n" +
                "Мы их будем кушать? (Да)\n" +
                "Возьмем суповой пакет\n" +
                "И рассыпем на пол? (Нет)\n" +
                "Налита в стакан вода.\n" +
                "Будем пить ее мы? (Да)\n" +
                "В миске с солью лебеда,\n" +
                "Мы ее в окрошку? (Нет)";
        String res = s.replace("Да", "Не");
        System.out.println(res);

        //Задача 3. Программа должна обрабатывать все строки, подобные указанным.
        System.out.println("\n3.3. Из URL извлечь протокол, домен, имя файла и расширение. https://www.computerhope.com/index.html\n");
        URL url = new URL("https://www.computerhope.com/index.html");

        System.out.println("протокол = " + url.getProtocol());
        System.out.println("домен = " + url.getHost());
        System.out.println("имя файла = " + url.getFile());
        String[] str=url.toString().split("\\.");
        System.out.println("расширение файла = "+str[str.length-1]);
    }
}
