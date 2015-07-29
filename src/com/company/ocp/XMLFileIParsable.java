package com.company.ocp;

import java.io.File;


public class XMLFileIParsable implements IParsable {
    public void parse(File file) {
        System.out.println("Parsing XML File" + file);
    }
}
