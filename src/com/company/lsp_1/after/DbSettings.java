package com.company.lsp_1.after;

public class DbSettings implements Loadable {

    @Override
    public void Load() {
      System.out.println("Load DBSettings into the memory");
    }
}
