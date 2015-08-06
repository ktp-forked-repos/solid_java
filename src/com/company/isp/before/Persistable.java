package com.company.isp.before;

public interface Persistable {

    void load();

    // Saves to a file
    void saveToFile();

    // Saves to redis
    void saveToRedis();
}
