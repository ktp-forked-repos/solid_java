package com.company.lsp_1.before;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public interface Persistable {
    //Load file into memory
    void load();
    // Save it to a file/db
    void save() throws NotImplementedException;
}
