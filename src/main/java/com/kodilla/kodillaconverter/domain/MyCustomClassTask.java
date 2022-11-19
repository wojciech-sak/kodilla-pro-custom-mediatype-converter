package com.kodilla.kodillaconverter.domain;

public class MyCustomClassTask {

    private final String fieldOne;
    private final String fieldTwo;
    private final String fieldThree;

    public MyCustomClassTask(String field1, String field2, String field3) {
        fieldOne = field1;
        fieldTwo = field2;
        fieldThree = field3;
    }

    public String getFieldOne() {
        return fieldOne;
    }

    public String getFieldTwo() {
        return fieldTwo;
    }

    public String getFieldThree() {
        return fieldThree;
    }

}