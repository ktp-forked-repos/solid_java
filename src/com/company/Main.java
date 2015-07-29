package com.company;

import com.company.lsp_1.ApplicationSettings;
import com.company.lsp_1.ConsumerSettings;
import com.company.lsp_1.DbSettings;
import com.company.lsp_1.IPersistable;
import com.company.lsp_2.Ellipse;
import com.company.lsp_2.Point;
import com.company.ocp.Parser;
import com.company.ocp.XMLFileParser;
import com.company.ocp.ClientFileParserNew;
import com.company.ocp.ClientFileParser;
import com.company.srp.ContentNotifier;
import com.company.srp.NewContentNotifier;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import com.company.lsp_2.MyCircle;

public class Main {

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.srpDemo();
        main.ocpDemo();
        main.lsp1Demo();

        Ellipse ellipse = new Ellipse();
        main.lsp2Demo(ellipse);

        Ellipse circle = new MyCircle();
        // Violated LSP
        main.lsp2Demo(circle);
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

    private void lsp1Demo() {
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

    private void lsp2Demo(Ellipse e) throws Exception {
        Point a = new Point(1, 0);
        Point b = new Point(-1, 0);
        //if (e instanceof Ellipse) {
        e.setFoci(a, b);
        e.setMajorAxis(3);
        //} else {
        //    throw new Exception("Not a ellipse");
        //}

        // Post Conditions
        // Expect a (1,0) b (-1, 0)
        // Expect MajorAxis == 3
    }

}
