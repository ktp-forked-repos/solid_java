package com.company.lsp_2;


public class Ellipse {

    protected Point focusA;
    protected Point focusB;
    protected int majorAxis;

    public void setFoci(Point x, Point y)
    {
        this.focusA = x;
        this.focusB = y;
    }

    public void setMajorAxis(int a){
        this.majorAxis = a;
    }
}