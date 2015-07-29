package com.company.lsp_1.after;

public class DbSettings implements com.company.lsp_1.after.ILoadable{

    @Override
    public void Load() {
      System.out.println("Load DBSettings into the memory");
    }
}
