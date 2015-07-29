package com.company.isp;

public interface ISavable {
    // Loads into Memory
    void Load();

    // Saves to a file
    void saveToFile();

    // Saves to redis
    void saveToRedis();
}
