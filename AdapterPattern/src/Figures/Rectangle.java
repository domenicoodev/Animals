package Figures;

public class Rectangle implements Figure2D{
    private double width;
    private double height;

    public Rectangle(double width,double height){
        if(width < 0.5 || height < 0.5)
        {
            throw new IllegalArgumentException("Dati non validi!");
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth(){ return width;}
    public double getHeight(){return height;}

    @Override
    public double area(){return width*height;}
    @Override
    public double perimeter(){return (width*2)+(height*2);}
}
