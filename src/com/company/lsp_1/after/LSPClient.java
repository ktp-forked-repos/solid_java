package com.company.lsp_1.after;

import java.util.ArrayList;
import java.util.Arrays;

public class LSPClient {

    public void execute() {
        ArrayList<com.company.lsp_1.after.IPersistable> saveSettings = new ArrayList<IPersistable>(Arrays.asList(
                new com.company.lsp_1.after.ApplicationSettings(),
                new com.company.lsp_1.after.ConsumerSettings()
        ));

        // Load all settings
        saveSettings.forEach((
                com.company.lsp_1.after.IPersistable s
        ) -> s.Save());

        ArrayList<com.company.lsp_1.after.ILoadable> readableSettings = new ArrayList<com.company.lsp_1.after.ILoadable>(Arrays.asList(
                new com.company.lsp_1.after.DbSettings()
        ));

        // Load all settings
        readableSettings.forEach((
                com.company.lsp_1.after.ILoadable s
        ) -> s.Load());
    }
}
