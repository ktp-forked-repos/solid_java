package com.company.isp.before;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ISPClient implements Persistable {

    public void load() {
        System.out.println("I load stuff into memory");
    }

    @Override
    public void saveToFile() {
      throw new NotImplementedException();
    }

    @Override
    public void saveToRedis() {
        throw new NotImplementedException();
    }
}
