package com.company.isp.after;

public interface ISavable {
    // Loads into Memory
    void Load();

    // Saves to a file
    void saveToFile();

    // Saves to redis
    void saveToRedis();
}
