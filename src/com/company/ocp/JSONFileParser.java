package com.company.ocp;

import java.io.File;

public class JSONFileParser implements Parser{
    public void parse(File file) {
        System.out.println("Parsing JSON File" + file);
    }

}
