package com.company;

import com.company.lsp_1.ApplicationSettings;
import com.company.lsp_1.ConsumerSettings;
import com.company.lsp_1.DbSettings;
import com.company.lsp_1.IPersistable;
import com.company.ocp.Parser;
import com.company.ocp.XMLFileParser;
import com.company.ocp.ClientFileParserNew;
import com.company.ocp.ClientFileParser;
import com.company.srp.ContentNotifier;
import com.company.srp.NewContentNotifier;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.srpDemo();
        main.ocpDemo();
        main.lspDemo();
    }

    private void srpDemo() {
        // SRP Old code
        ContentNotifier notifier = new ContentNotifier("~/something.csv");
        notifier.sendNotification();

        //SRP Refactored new_code code
        NewContentNotifier newNotifier = new NewContentNotifier("~/something.csv");
        newNotifier.sendNotification();
    }

    private void ocpDemo() {
        // OCP Old Code
        ClientFileParser parser = new ClientFileParser(new File("~/something.csv"));
        parser.parse();


        // OCP New Code
        XMLFileParser xmlParser = new XMLFileParser();
        ClientFileParserNew newParser = new ClientFileParserNew((Parser) xmlParser, new File("~/something.csv"));
        newParser.parse();
    }

    private void lspDemo() {
        ArrayList<IPersistable> allSettings = new ArrayList<IPersistable>(Arrays.asList(
                new ApplicationSettings(),
                new ConsumerSettings(),
                new DbSettings()
        ));

        // Load all settings
        allSettings.forEach((
                IPersistable s
        ) -> s.Load());

        // Save all Settings

        // Bad Bad Way
        allSettings.forEach((
                IPersistable s
        ) -> {
            //if(s instanceof DbSettings)return;
                    s.Save();
        }
        );
    }

}
