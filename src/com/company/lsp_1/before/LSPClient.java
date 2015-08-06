package com.company.lsp_1.before;

import java.util.ArrayList;

public class LSPClient {

    public void execute(ArrayList<Persistable> resources){
        // Load all settings
        resources.forEach((
                Persistable s
        ) -> s.load());

        // Save all Settings

        // Bad Bad Way
        resources.forEach((
                        Persistable s
                ) -> {
                    if(s instanceof DbSettings)return;
                    s.save();
                }
        );
    }
}
