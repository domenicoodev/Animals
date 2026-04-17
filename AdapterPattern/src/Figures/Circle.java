package Figures;

public class Circle implements Figure2D{
    private double radius;

    public Circle(double radius){
        if(radius < 0.5){
            throw new IllegalArgumentException("Dati non validi!");
        }
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public double area(){return 3.14 * radius * radius;}

    @Override
    public double perimeter(){return 2 * 3.14 * radius;}

}
