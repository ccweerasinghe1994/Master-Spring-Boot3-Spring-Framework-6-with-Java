package com.wchamara.learnspringframework;

import java.io.Serializable;

public class Test {

}

class POJO {
    private String text;
    private int number;

    @Override
    public String toString() {
        return "POJO{" +
                "text='" + text + '\'' +
                ", number=" + number +
                '}';
    }
}

class JavaBean implements Serializable {

    private String text;
    private int number;

    //    no arg constructor
    public JavaBean() {

    }

//    getters ans setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "JavaBean{" +
                "text='" + text + '\'' +
                ", number=" + number +
                '}';
    }
}
