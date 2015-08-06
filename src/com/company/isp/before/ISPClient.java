package com.company.isp.before;

import com.company.isp.after.Savable;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class ISPClient implements Savable {

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
