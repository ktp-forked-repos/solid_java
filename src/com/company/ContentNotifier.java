package com.company;

public class ContentNotifier {

    private String filepath;

    public ContentNotifier(String filepath){
        this.filepath = filepath;
    }

    public void sendNotification() {
       // Parsing Contents from a file
       String contents = parseContentFromFile();
       // Notifying user of the parsing
       notifyUserWith(contents);
    }


    private String parseContentFromFile(){
        // Logic for parsing file contents goes here
        System.out.println("Parsing file contents from " + filepath);
        return "Parsed Content";
    }

    private void notifyUserWith(String contents) {
        // Logic for mail sending goes here
        System.out.println("Sending a mail notification with contents " + contents);
    }
}
