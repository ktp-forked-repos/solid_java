package com.company.lsp_1.after;


public class ApplicationSettings implements Persistable, Loadable {

    @Override
    public void load() {
        System.out.println("Load Application Settings into memory");
    }

    @Override
    public void save() {
        System.out.println("Saving Application Settings into a file");
    }
}
