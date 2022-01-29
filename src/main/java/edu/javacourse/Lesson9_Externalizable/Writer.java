package edu.javacourse.Lesson9_Externalizable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Writer {
    public static void main(String[] args) {
        testWriter();
    }

    // Метод записывает в байт код подоваемые ему аргументы и помещает его в файл out.dat
    private static void testWriter() {
        SerialSecond serial = new SerialSecond();
        serial.setFirstCode("FirstCode");
        serial.setFirstName("FirstName");
        serial.setSecondCode("SecondCode");
        serial.setSecondName("SecondName");

        try (FileOutputStream fs = new FileOutputStream("src/main/java/edu/javacourse/Lesson9_Externalizable/out.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fs)) {

            oos.writeObject(serial);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}