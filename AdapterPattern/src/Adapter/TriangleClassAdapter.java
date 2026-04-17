package Adapter;

import Figures.Figure2D;
import Figures.XXXTriangle;

public class TriangleClassAdapter extends XXXTriangle implements Figure2D {

    public TriangleClassAdapter(double base, double altezza, double lato2, double lato3){
        super(base,altezza,lato2,lato3);
    }

    @Override
    public double area(){ return super.computeArea();}

    @Override
    public double perimeter() {return computePerimeter();}

}

