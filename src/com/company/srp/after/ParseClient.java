package com.company.srp.after;

public class ParseClient {

    public void run() {
        ContentParser parser = new ContentParser("~/something.csv");
        String contents = parser.parseContents();
    }
}
