package com.company.srp.after;

public class ContentParser {

    private String filepath;

    public ContentParser(String filepath) {
        this.filepath = filepath;
    }

    public String parseContents() {
        System.out.println("Parsing file contents from " + filepath);
        return "Parsed content";
    }
}
