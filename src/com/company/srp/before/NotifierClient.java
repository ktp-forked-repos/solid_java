package com.company.srp.before;

import java.io.File;

public class NotifierClient {

    public void run() {
        ContentNotifier contentNotifier = new ContentNotifier("~/something.csv");
        contentNotifier.notifyUser("My Own content");
    }
}
