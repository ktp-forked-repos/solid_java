package com.company.ocp;

import java.io.File;

public class CSVFileIParsable implements IParsable {
    public void parse(File file) {
        System.out.println("Parsing CSV File" + file);
    }
}
