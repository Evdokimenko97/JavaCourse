package edu.javacourse.Lesson2_ReadTextFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class TextFile {
    public static void main(String[] args) {
        final String fileName = "src/main/resources/text.txt";
        List<String> list = readList(fileName);
        for (String str: list) {
            System.out.println(str);
        }
    }

    private static List<String> readList(String fileName) {
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
            ex.printStackTrace();
        }
        return result;
    }
}