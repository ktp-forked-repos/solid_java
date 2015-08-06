package com.company.lsp_1.before;


public class ConsumerSettings implements Persistable {

    @Override
    public void load() {
        System.out.println("Load Consumer Settings into memory");
    }

    @Override
    public void save() {
        System.out.println("Save Consumer Settings into a file");
    }
}
