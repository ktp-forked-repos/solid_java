package com.company.isp;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ISPClient implements ISavable{

    @Override
    public void Load() {
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
