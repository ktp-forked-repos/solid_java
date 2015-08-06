package com.company.ocp.after;

import java.io.File;


public class ClientFileParser {

    private Parsable parsable;
    private File file;

    public ClientFileParser(Parsable parsable, File file) {
        this.parsable = parsable;
        this.file = file;
    }

    public void parse() {
        parsable.parse(file);
    }
}

