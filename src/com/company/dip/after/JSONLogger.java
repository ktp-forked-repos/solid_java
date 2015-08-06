package com.company.dip.after;


public class JSONLogger implements Logger {

    @Override
    public void log() {
        System.out.println("I am a JSON Logger");
    }
}
