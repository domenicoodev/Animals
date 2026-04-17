package Adapter;

import Figures.Figure2D;
import Figures.XXXTriangle;

public class TriangleObjectAdapter implements Figure2D {

    private XXXTriangle triangle;

    public TriangleObjectAdapter(double base,double altezza,double lato2,double lato3){
        this.triangle = new XXXTriangle(base,altezza,lato2,lato3);
    }

    @Override
    public double area(){return triangle.computeArea();}

    @Override
    public double perimeter(){return triangle.computePerimeter();}

}

