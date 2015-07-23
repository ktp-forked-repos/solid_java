package com.company;

public class Main {

    public static void main(String[] args) {
        // SRP Old code
        ContentNotifier notifier = new ContentNotifier("~/something.csv");
        notifier.sendNotification();

        //SRP Refactored new code
        NewContentNotifier newNotifier = new NewContentNotifier("~/something.csv");
        newNotifier.sendNotification();
    }
}
