package com.company.ocp;

import com.company.ocp.CSVFileParser;
import com.company.ocp.JSONFileParser;
import com.company.ocp.XMLFileParser;

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
            CSVFileParser csv_parser = new CSVFileParser();
            csv_parser.parse(file);
        } else if (ext.equals(".json")) {
            JSONFileParser json_parser = new JSONFileParser();
            json_parser.parse(file);
        } else {
            XMLFileParser xml_parser = new XMLFileParser();
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

