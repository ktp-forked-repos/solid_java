package com.company.dip.after;


public class TextLogger implements Logger {

    @Override
    public void log() {
        System.out.println("I am a text Logger");
    }
}
