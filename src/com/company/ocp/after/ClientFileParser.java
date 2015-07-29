package com.company.ocp.after;

import java.io.File;


public class ClientFileParser {

    private com.company.ocp.after.IParsable IParsable;
    private File file;

    public ClientFileParser(IParsable IParsable, File file) {
        this.IParsable = IParsable;
        this.file = file;
    }

    public void parse() {
        IParsable.parse(file);
    }
}

