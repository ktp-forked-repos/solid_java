package com.company.lsp_1;


public class ApplicationSettings implements IPersistable{

    public ApplicationSettings() {
    }

    @Override
    public void Load() {
        System.out.println("Load Application Settings into memory");
    }

    @Override
    public void Save() {
        System.out.println("Saving Application Settings into a file");
    }
}
