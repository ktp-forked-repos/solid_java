package com.company.srp.after;


public class ContentNotifier {

    private String filepath;

    public ContentNotifier(String filepath) {
        this.filepath = filepath;
    }

    public void sendNotification() {
        // Parsing Contents from a file
        ContentParser parser = new ContentParser();
        String contents = parser.parse(filepath);

        // Notifying user of the parsing
        ParseNotifier notifier = new ParseNotifier();
        notifier.notifyUser(contents);
    }
}
