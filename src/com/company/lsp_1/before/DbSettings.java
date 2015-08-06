package com.company.lsp_1.before;

public class DbSettings implements Persistable {

    @Override
    public void Load() {
      System.out.println("Load DBSettings into the memory");
    }

    @Override
    public void Save() {
        System.out.println("Saving to a file");
    }
}
