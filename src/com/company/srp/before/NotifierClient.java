package com.company.srp.before;

public class NotifierClient {

    public void run() {
        ContentNotifier contentNotifier = new ContentNotifier("~/something.csv");
        contentNotifier.notifyUser("My Own content");
    }
}
