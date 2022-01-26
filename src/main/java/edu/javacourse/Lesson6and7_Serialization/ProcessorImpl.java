package edu.javacourse.Lesson6and7_Serialization;

public class ProcessorImpl implements Processor {

    @Override
    public String process(String code, String name) {
        return code + ": " +name;
    }
}
