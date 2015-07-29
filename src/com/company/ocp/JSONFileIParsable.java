package com.company.ocp;

import java.io.File;

public class JSONFileIParsable implements IParsable {
    public void parse(File file) {
        System.out.println("Parsing JSON File" + file);
    }

}
