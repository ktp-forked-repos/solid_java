package com.company.lsp_1.before;


import com.company.isp.after.ILoadable;

public class ApplicationSettings implements IPersistable, ILoadable{

    @Override
    public void Load() {
        System.out.println("Load Application Settings into memory");
    }

    @Override
    public void Save() {
        System.out.println("Saving Application Settings into a file");
    }
}
