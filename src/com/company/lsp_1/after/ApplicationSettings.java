package com.company.lsp_1.after;


public class ApplicationSettings implements com.company.lsp_1.after.IPersistable, com.company.lsp_1.after.ILoadable{

    @Override
    public void Load() {
        System.out.println("Load Application Settings into memory");
    }

    @Override
    public void Save() {
        System.out.println("Saving Application Settings into a file");
    }
}
