package com.company;

import com.company.ocp.Parser;
import com.company.ocp.XMLFileParser;
import com.company.ocp.new_code.ClientFileParserNew;
import com.company.ocp.old_code.ClientFileParser;
import com.company.srp.ContentNotifier;
import com.company.srp.NewContentNotifier;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        // SRP Old code
        ContentNotifier notifier = new ContentNotifier("~/something.csv");
        notifier.sendNotification();

        //SRP Refactored new_code code
        NewContentNotifier newNotifier = new NewContentNotifier("~/something.csv");
        newNotifier.sendNotification();


        // OCP Old Code
        ClientFileParser parser = new ClientFileParser(new File("~/something.csv"));
        parser.parse();


        // OCP New Code
        XMLFileParser xmlParser = new XMLFileParser();
        ClientFileParserNew newParser = new ClientFileParserNew((Parser) xmlParser, new File("~/something.csv"));
        newParser.parse();
    }
}
