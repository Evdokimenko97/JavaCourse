package edu.javacourse.Lesson8_SerialVersionUID;

public class ProcessorImpl implements Processor {

    @Override
    public String process(String code, String name) {
        return code + ": " +name;
    }
}
