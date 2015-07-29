package com.company.ocp;

import java.io.File;

public class CSVFileParser implements Parser {
    public void parse(File file) {
        System.out.println("Parsing CSV File" + file);
    }
}
