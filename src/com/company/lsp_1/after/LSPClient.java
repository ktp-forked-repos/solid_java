package com.company.lsp_1.after;

import java.util.ArrayList;
import java.util.Arrays;

public class LSPClient {

    public void execute() {
        ArrayList<Persistable> saveSettings = new ArrayList<Persistable>(Arrays.asList(
                new ApplicationSettings(),
                new ConsumerSettings()
        ));

        // Load all settings
        saveSettings.forEach((
                Persistable s
        ) -> s.Save());

        ArrayList<Loadable> readableSettings = new ArrayList<Loadable>(Arrays.asList(
                new DbSettings()
        ));

        // Load all settings
        readableSettings.forEach((
                Loadable s
        ) -> s.Load());
    }
}
