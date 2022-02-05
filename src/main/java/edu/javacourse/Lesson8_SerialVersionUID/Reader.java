package edu.javacourse.Lesson8_SerialVersionUID;

import java.io.*;

public class Reader {
    public static void main(String[] args) {
        testRead();
    }

    // Метод считывает из байт код файла out.dat и выводит аргументы
    private static void testRead() {
        try (FileInputStream fs = new FileInputStream("src/main/java/edu/javacourse/Lesson8_SerialVersionUID/out.dat");
             ObjectInputStream ois = new ObjectInputStream(fs)) {

            SerialFirst first = (SerialFirst) ois.readObject();
            System.out.println(first.getFirstCode());
            System.out.println(first.getFirstName());
            System.out.println(first.getProcessor());

        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}