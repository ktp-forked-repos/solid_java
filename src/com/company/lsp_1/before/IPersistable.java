package com.company.lsp_1.before;

public interface IPersistable {
    //Load file into memory
    void Load();
    // Save it to a file/db
    void Save();
}
