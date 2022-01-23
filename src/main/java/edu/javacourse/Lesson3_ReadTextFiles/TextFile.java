package edu.javacourse.Lesson3_ReadTextFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TextFile {
    public static void main(String[] args) {
        final String fileName = "src/main/resources/text.txt";
        List<String> list = readText1(fileName);
        for (String str: list) {
            System.out.println(str);
        }
    }

    private static List<String> readText1(String fileName) {
        List<String> result = new LinkedList<>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            try {
                String line;
                while ((line = reader.readLine()) != null) {
                    result.add(line);
                }
            } finally {
                reader.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return result;
    }

    private static List<String> readText2(String fileName) {
        List<String> result = new LinkedList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.add(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return result;
    }

    private static  List<String> readText3(String fileName) {
        try {
            return Files.readAllLines(Paths.get(fileName));
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return Collections.emptyList();
    }
}