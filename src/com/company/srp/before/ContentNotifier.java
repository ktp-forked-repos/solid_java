package com.company.srp.before;

public class ContentNotifier {

    private String filepath;

    public ContentNotifier(String filepath){
        this.filepath = filepath;
    }

    public void sendNotification() {
        String parsedContent = "Parsing file contents from " + filepath;
        System.out.println("Sending a mail notification with contents " + parsedContent);
    }


}
