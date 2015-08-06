package com.company.lsp_1.before;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class DbSettings implements Persistable {

    @Override
    public void load() {
      System.out.println("Load DBSettings into the memory");
    }

    @Override
    public void save() {
        throw new NotImplementedException();
    }
}
