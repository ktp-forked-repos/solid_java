package com.company.isp.after;

public class ISPClient implements ILoadable {

    @Override
    public void Load() {
        System.out.println("I load only Load method");
    }
}
