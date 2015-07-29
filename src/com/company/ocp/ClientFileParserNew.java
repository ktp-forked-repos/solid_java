package com.company.ocp;

import java.io.File;


public class ClientFileParserNew {

    private IParsable IParsable;
    private File file;

    public ClientFileParserNew(IParsable IParsable, File file) {
        this.IParsable = IParsable;
        this.file = file;
    }

    public void parse() {
        IParsable.parse(file);
    }
}

