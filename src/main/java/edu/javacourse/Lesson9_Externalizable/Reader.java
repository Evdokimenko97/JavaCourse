package edu.javacourse.Lesson9_Externalizable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Reader {
    public static void main(String[] args) {
        testRead();
    }

    // Метод считывает из байт код файла out.dat и выводит аргументы
    private static void testRead() {
        try (FileInputStream fs = new FileInputStream("src/main/java/edu/javacourse/Lesson9_Externalizable/out.dat");
             ObjectInputStream ois = new ObjectInputStream(fs)) {

            SerialSecond serial = (SerialSecond) ois.readObject();
            System.out.println(serial.getFirstCode());
            System.out.println(serial.getFirstName());
            System.out.println(serial.getSecondCode());
            System.out.println(serial.getSecondName());

        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}