package com.company.isp.before;

public interface IPersistable {
    // Saves to a file
    void saveToFile();

    // Saves to redis
    void saveToRedis();
}
