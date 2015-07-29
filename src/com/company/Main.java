package com.company;

import com.company.dip.before.DIPClient;
import com.company.dip.before.TextLogger;
import com.company.isp.ISPClient;
import com.company.isp.ISPClientNew;
import com.company.lsp_1.after.ApplicationSettings;
import com.company.lsp_1.after.ConsumerSettings;
import com.company.lsp_1.after.DbSettings;
import com.company.lsp_1.after.IPersistable;
import com.company.lsp_2.Ellipse;
import com.company.lsp_2.MyCircle;
import com.company.lsp_2.Point;
import com.company.ocp.after.ClientFileParser;
import com.company.ocp.after.IParsable;
import com.company.ocp.XMLFileParser;
import com.company.srp.after.ContentNotifier;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

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

        main.ispDemo();
        
        main.dipDemo();
    }

    private void srpDemo() {
        // SRP Old code
        com.company.srp.before.ContentNotifier notifier = new com.company.srp.before.ContentNotifier("~/something.csv");
        notifier.sendNotification();

        //SRP Refactored new_code code
        ContentNotifier newNotifier = new ContentNotifier("~/something.csv");
        newNotifier.sendNotification();
    }

    private void ocpDemo() {
        // OCP Old Code
        com.company.ocp.before.ClientFileParser parser = new com.company.ocp.before.ClientFileParser(new File("~/something.csv"));
        parser.parse();


        // OCP New Code
        XMLFileParser xmlParser = new XMLFileParser();
        ClientFileParser newParser = new ClientFileParser((IParsable) xmlParser, new File("~/something.csv"));
        newParser.parse();
    }

    private void lsp1Demo() {
        //before
        new com.company.lsp_1.before.LSPClient().execute();

        //After
        new com.company.lsp_1.after.LSPClient().execute();
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

    private void ispDemo() {
        //Old Code
        new ISPClient().Load();

        // Nes Code
        new ISPClientNew().Load();
    }

    private void dipDemo() {
        //Before
        new DIPClient().execute(new TextLogger());

        // After
        new com.company.dip.after.DIPClient().execute(new com.company.dip.after.TextLogger());
        new com.company.dip.after.DIPClient().execute(new com.company.dip.after.JSONLogger());
        new com.company.dip.after.DIPClient().execute(new com.company.dip.after.XMLLogger());
    }
}
