package edu.javacourse.Lesson9_Externalizable;

import java.io.Serializable;

public class SerialFirst {
    public static final long serialVersionUID = 199L;

    private String firstCode;
    private String firstName;

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
}