package edu.javacourse.Lesson6and7_Serialization;

import java.io.*;

public class Starter {
    public static void main(String[] args) {
        testWrite();
        testRead();
    }

    // Метод записывает в байт код подоваемые ему аргументы и помещает его в файл out.dat
    private static void testWrite() {
        SerialFirst first = new SerialFirst();
        first.setFirstCode("FirstCode");
        first.setFirstName("FirstName");
        first.setProcessor(new ProcessorImpl());

        try (FileOutputStream fs = new FileOutputStream("src/main/java/edu/javacourse/Lesson6and7_Serialization/out.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fs)) {

            oos.writeObject(first);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    // Метод считывает из байт код файла out.dat и выводит аргументы
    private static void testRead() {
        try (FileInputStream fs = new FileInputStream("src/main/java/edu/javacourse/Lesson6and7_Serialization/out.dat");
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