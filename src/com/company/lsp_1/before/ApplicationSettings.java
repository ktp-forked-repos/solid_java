package com.company.lsp_1.before;


public class ApplicationSettings implements Persistable {

    @Override
    public void load() {
        System.out.println("Load Application Settings into memory");
    }

    @Override
    public void save() {
        System.out.println("Save onto a file");
    }

}
