package com.company.ocp;

import java.io.File;


public class ClientFileParserNew {

    private Parser parser;
    private File file;

    public ClientFileParserNew(Parser parser, File file) {
        this.parser = parser;
        this.file = file;
    }

    public void parse() {
        parser.parse(file);
    }
}

