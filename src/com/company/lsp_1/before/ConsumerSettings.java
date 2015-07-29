package com.company.lsp_1.before;


public class ConsumerSettings implements com.company.lsp_1.before.IPersistable{

    @Override
    public void Load() {
        System.out.println("Load Consumer Settings into memory");
    }

    @Override
    public void Save() {
        System.out.println("Save Consumer Settings into a file");
    }
}
