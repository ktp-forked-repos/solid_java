package com.company.lsp_1.before;

import java.util.ArrayList;
import java.util.Arrays;

public class LSPClient {

    public void execute(){
        ArrayList<Persistable> allSettings = new ArrayList<Persistable>(Arrays.asList(
                new ApplicationSettings(),
                new ConsumerSettings(),
                new DbSettings()
        ));

        // Load all settings
        allSettings.forEach((
                Persistable s
        ) -> s.Load());

        // Save all Settings

        // Bad Bad Way
        allSettings.forEach((
                        Persistable s
                ) -> {
                    if(s instanceof DbSettings)return;
                    s.Save();
                }
        );
    }
}
