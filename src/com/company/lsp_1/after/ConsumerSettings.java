package com.company.lsp_1.after;

public class ConsumerSettings implements Persistable, Loadable {

    @Override
    public void Load() {
        System.out.println("Load Consumer Settings into memory");
    }

    @Override
    public void Save() {
        System.out.println("Save Consumer Settings into a file");
    }
}
