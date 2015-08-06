package com.company.ocp;

import com.company.ocp.after.Parsable;

import java.io.File;

public class XMLFileParser implements Parsable {
    public void parse(File file) {
        System.out.println("Parsing XML File" + file);
    }
}
