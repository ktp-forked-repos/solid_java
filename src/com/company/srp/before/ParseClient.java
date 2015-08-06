package com.company.srp.before;

import java.io.File;

public class ParseClient {

    public void run() {
        ContentNotifier contentNotifier = new ContentNotifier("~/something.csv");
        contentNotifier.parseContents();
    }
}
