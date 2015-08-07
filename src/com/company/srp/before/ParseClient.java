package com.company.srp.before;

public class ParseClient {

    public void run() {
        ContentNotifier contentNotifier = new ContentNotifier("~/something.csv");
        contentNotifier.parseContents();
    }
}
