package com.company.ocp;

import java.io.File;

public class ClientFileParser {

    private File file;

    public ClientFileParser(File file) {
        this.file = file;
    }

    public void parse() {
        String ext = getFileExtension(file);
        System.out.println("Extension" + ext);
        if (ext.equals(".csv")) {
            CSVFileIParsable csv_parser = new CSVFileIParsable();
            csv_parser.parse(file);
        } else if (ext.equals(".json")) {
            JSONFileIParsable json_parser = new JSONFileIParsable();
            json_parser.parse(file);
        } else {
            XMLFileIParsable xml_parser = new XMLFileIParsable();
            xml_parser.parse(file);
        }
    }

    private String getFileExtension(File file) {
        String name = file.getName();
        try {
            return name.substring(name.lastIndexOf("."));

        } catch (Exception e) {
            return "";
        }

    }
}

