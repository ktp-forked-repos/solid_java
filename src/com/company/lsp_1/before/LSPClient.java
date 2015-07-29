package com.company.lsp_1.before;

import com.company.lsp_1.after.DbSettings;

import java.util.ArrayList;
import java.util.Arrays;

public class LSPClient {

    public void execute(){
        ArrayList<com.company.lsp_1.before.IPersistable> allSettings = new ArrayList<com.company.lsp_1.before.IPersistable>(Arrays.asList(
                new com.company.lsp_1.before.ApplicationSettings(),
                new com.company.lsp_1.before.ConsumerSettings(),
                new com.company.lsp_1.before.DbSettings()
        ));

        // Load all settings
        allSettings.forEach((
                com.company.lsp_1.before.IPersistable s
        ) -> s.Load());

        // Save all Settings

        // Bad Bad Way
        allSettings.forEach((
                        com.company.lsp_1.before.IPersistable s
                ) -> {
                    if(s instanceof DbSettings)return;
                    s.Save();
                }
        );
    }
}
