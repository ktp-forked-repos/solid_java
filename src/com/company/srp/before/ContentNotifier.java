package com.company.srp.before;

public class ContentNotifier {

    private String filepath;

    public ContentNotifier(String filepath){
        this.filepath = filepath;
    }

    public String parseContents() {
        System.out.println("Parsing file contents from " + filepath);
        return "Some parsed content";
    }

    public void notifyUser(String parsedContent){
        System.out.println("Sending a mail notification with contents " + parsedContent);
    }
}
