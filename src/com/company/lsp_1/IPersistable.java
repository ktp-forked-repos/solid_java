package com.company.lsp_1;

public interface IPersistable {
    // Load Settings into Memory
    void Load();

    // Save it to a file/db
    void Save();
}
