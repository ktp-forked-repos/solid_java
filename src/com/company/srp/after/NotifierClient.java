package com.company.srp.after;

public class NotifierClient {

    public void run() {
        ParseNotifier parseNotifier = new ParseNotifier();
        parseNotifier.notifyUser("My Own content");
    }
}
