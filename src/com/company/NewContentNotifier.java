package com.company;


public class NewContentNotifier {

    private String filepath;

    public NewContentNotifier(String filepath) {
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

class ContentParser {

    public String parse(String filepath) {
        System.out.println("Parsing file contents from " + filepath);
        return "Parsed content";
    }
}

class ParseNotifier {

    public void notifyUser(String contents) {
        System.out.println("Sending a mail notification with contents " + contents);
    }
}
