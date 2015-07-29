package com.company.ocp;

import com.company.ocp.after.IParsable;

import java.io.File;

public class JSONFileParser implements IParsable {
    public void parse(File file) {
        System.out.println("Parsing JSON File" + file);
    }

}
