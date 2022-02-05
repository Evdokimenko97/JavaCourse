package edu.javacourse.Lesson10_SerialisationWithJAR;

import java.io.Serializable;

public class SerialFirst implements Serializable {
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