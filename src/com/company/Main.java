package com.company;

import com.company.dip.before.DIPClient;
import com.company.dip.before.TextLogger;
import com.company.isp.after.ISPClient;
import com.company.lsp_1.after.Loadable;
import com.company.lsp_1.before.ApplicationSettings;
import com.company.lsp_1.before.ConsumerSettings;
import com.company.lsp_1.before.DbSettings;
import com.company.lsp_1.before.Persistable;
import com.company.lsp_2.Ellipse;
import com.company.lsp_2.MyCircle;
import com.company.lsp_2.Point;
import com.company.ocp.after.ClientFileParser;
import com.company.ocp.after.Parsable;
import com.company.ocp.XMLFileParser;

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

    private void srpDemo(){

    }

    private void ocpDemo() {
        // OCP Old Code
        com.company.ocp.before.ClientFileParser parser = new com.company.ocp.before.ClientFileParser(new File("~/something.csv"));
        parser.parse();


        // OCP New Code
        XMLFileParser xmlParser = new XMLFileParser();
        ClientFileParser newParser = new ClientFileParser((Parsable) xmlParser, new File("~/something.csv"));
        newParser.parse();
    }

    private void lsp1Demo() {
        //before
        ArrayList<Persistable> resources = new ArrayList<Persistable>(Arrays.asList(
                new ApplicationSettings(),
                new ConsumerSettings(),
                new DbSettings()
        ));

        new com.company.lsp_1.before.LSPClient().execute(resources);

        //After
        ArrayList<com.company.lsp_1.after.Persistable> saveResources = new ArrayList<com.company.lsp_1.after.Persistable>(Arrays.asList(
                new com.company.lsp_1.after.ApplicationSettings(),
                new com.company.lsp_1.after.ConsumerSettings()
        ));
        new com.company.lsp_1.after.LSPClient().saveAll(saveResources);

        ArrayList<com.company.lsp_1.after.Loadable> loadResources = new ArrayList<Loadable>(Arrays.asList(
                new com.company.lsp_1.after.ApplicationSettings(),
                new com.company.lsp_1.after.ConsumerSettings(),
                new com.company.lsp_1.after.DbSettings()
        ));
        new com.company.lsp_1.after.LSPClient().loadAll(loadResources);
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
        new com.company.isp.before.ISPClient().load();

        // Nes Code
        new ISPClient().load();
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
