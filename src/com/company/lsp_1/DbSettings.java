package com.company.lsp_1;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class DbSettings implements IPersistable{

    public void DbSettings() {
    }

    @Override
    public void Load() {
      System.out.println("Load DBSettings into the memory");
    }

    @Override
    public void Save() {
       throw new NotImplementedException();
    }
}
