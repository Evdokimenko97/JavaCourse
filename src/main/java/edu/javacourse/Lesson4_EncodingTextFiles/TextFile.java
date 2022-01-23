package edu.javacourse.Lesson4_EncodingTextFiles;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TextFile {
    public static void main(String[] args) {
        final String fileName1 = "src/main/resources/text.txt";
        final String fileName2 = "src/main/resources/text2.txt";

        List<String> list1 = readText1(fileName1);
        for (String str1 : list1) {
            System.out.println(str1);
        }

        System.out.println();

        List<String> list2 = readText2(fileName2);
        for (String str2 : list2) {
            System.out.println(str2);
        }
    }

    private static List<String> readText1(String fileName1) {
        List<String> result = new LinkedList<>();

        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(fileName1), "UTF-8");
             BufferedReader br = new BufferedReader(isr)) {
            String line;
            while ((line = br.readLine()) != null) {
                result.add(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

        return result;
    }

    private static List<String> readText2(String fileName2) {
        try {
            return Files.readAllLines(Paths.get(fileName2), Charset.forName("cp1251"));
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return Collections.emptyList();
    }
}
