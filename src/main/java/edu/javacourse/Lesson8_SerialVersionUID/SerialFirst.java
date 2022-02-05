package edu.javacourse.Lesson8_SerialVersionUID;

import java.io.Serializable;

public class SerialFirst implements Serializable {
    public static final long serialVersionUID = 199L;

    private String firstCode;
    private String firstName;
//    private String firstOther;
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

//    public String getFirstOther() {
//        return firstOther;
//    }
//
//    public void setFirstOther(String firstOther) {
//        this.firstOther = firstOther;
//    }
}