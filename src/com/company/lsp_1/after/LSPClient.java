package com.company.lsp_1.after;

import java.util.ArrayList;

public class LSPClient {

    public void saveAll(ArrayList<Persistable> resources) {
        // Save all settings
        resources.forEach((
                Persistable s
        ) -> s.save());
    }

    public void loadAll(ArrayList<Loadable> resources) {
        // Load all settings
        resources.forEach((
                Loadable s
        ) -> s.load());
    }
}
