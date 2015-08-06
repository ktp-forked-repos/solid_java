package com.company.lsp_1.after;

public class DbSettings implements Loadable {

    @Override
    public void load() {
      System.out.println("Load DBSettings into the memory");
    }
}
