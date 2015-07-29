package com.company.dip.after;


public class TextLogger implements ILogger {

    @Override
    public void log() {
        System.out.println("I am a text Logger");
    }
}
