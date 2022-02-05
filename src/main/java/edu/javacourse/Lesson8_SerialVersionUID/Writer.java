package edu.javacourse.Lesson8_SerialVersionUID;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Writer {
    public static void main(String[] args) {
        testWriter();
    }

    // Метод записывает в байт код подоваемые ему аргументы и помещает его в файл out.dat
    private static void testWriter() {
        SerialFirst first = new SerialFirst();
        first.setFirstCode("FirstCode");
        first.setFirstName("FirstName");
        first.setProcessor(new ProcessorImpl());

        try (FileOutputStream fs = new FileOutputStream("src/main/java/edu/javacourse/Lesson8_SerialVersionUID/out.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fs)) {

            oos.writeObject(first);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}