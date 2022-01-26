package edu.javacourse.Lesson5_Formatter;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Formatter;

public class Starter {
    public static void main(String[] args) throws IOException {
        /** Перевод текста в формат. В java doc по поиску formatter.
         %1$tY.%1$tm.%1$td - Первый аргумент time Year, month, day,
         %1tR - Первый аргумент time Время в 24 формате,
         %.2f - Число в формате float,
         %s - Значение аргумента
         **/

        String s = "%1$tY.%1$tm.%1$td %1tR переведена сумма в размере %.2f руб. по счету № '%s' %n";

        String answer = String.format(s, new Date(), 99.8, "AC12345");
//      String answer = String.format(Locale.forLanguageTag("ru"), s,new Date(), 99.8, "AC12345");
        System.out.println(answer);

        try (Formatter fm = new Formatter(new File("src/main/java/edu/javacourse/Lesson5_Formatter/out.txt"))) {
            fm.format(s, new Date(), 99.8, "AC12345");
            fm.format(s, new Date(), 99.8, "AC12345");
            fm.format(s, new Date(), 99.8, "AC12345");
            fm.format(s, new Date(), 99.8, "AC12345");
        }
    }
}