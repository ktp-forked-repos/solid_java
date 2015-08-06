package com.company.isp.after;

public interface Savable {
    // Saves to a file
    void saveToFile();

    // Saves to redis
    void saveToRedis();
}
