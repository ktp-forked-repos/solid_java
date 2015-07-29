package com.company.ocp;

import java.io.File;


public class XMLFileParser implements Parser{
    public void parse(File file) {
        System.out.println("Parsing XML File" + file);
    }
}
