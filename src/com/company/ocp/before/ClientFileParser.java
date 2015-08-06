package com.company.ocp.before;

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
        if (ext.equals(".csv")) {
            CSVFileParser csvFileParser = new CSVFileParser();
            csvFileParser.parse(file);
        } else if (ext.equals(".json")) {
            JSONFileParser jsonParser = new JSONFileParser();
            jsonParser.parse(file);
        } else {
            XMLFileParser xmlParser = new XMLFileParser();
            xmlParser.parse(file);
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

