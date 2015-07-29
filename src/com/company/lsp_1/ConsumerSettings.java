package com.company.lsp_1;

public class ConsumerSettings implements IPersistable{

    public ConsumerSettings() {
    }

    @Override
    public void Load() {
        System.out.println("Load Consumer Settings into memory");
    }

    @Override
    public void Save() {
        System.out.println("Save Consumer Settings into a file");
    }
}
