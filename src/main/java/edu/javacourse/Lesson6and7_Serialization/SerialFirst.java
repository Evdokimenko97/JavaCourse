package edu.javacourse.Lesson6and7_Serialization;

import java.io.Serializable;

public class SerialFirst implements Serializable {
    private String firstCode;
    private String firstName;
    private transient Processor processor;

    public String getFirstCode() {
        return firstCode;
    }

    public void setFirstCode(String firstCode) {
        this.firstCode = firstCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Processor getProcessor() {
        return processor;
    }
}