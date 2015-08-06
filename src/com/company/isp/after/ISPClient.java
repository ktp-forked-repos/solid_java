package com.company.isp.after;

public class ISPClient implements Loadable {

    @Override
    public void Load() {
        System.out.println("I load only Load method");
    }
}
