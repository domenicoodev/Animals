import Adapter.TriangleClassAdapter;
import Adapter.TriangleObjectAdapter;
import Figures.Circle;
import Figures.Figure2D;
import Figures.Rectangle;

public class ProvaAdapter{

    public static final void main(String[] args){
        Figure2D[] figure = new Figure2D[4];
        figure[0] = new Rectangle(3.5,2.0);
        figure[1] = new Circle(5.0);
        figure[2] = new TriangleClassAdapter(2.6,3.4,2.2,2.5);
        figure[3] = new TriangleObjectAdapter(2.6,3.4,2.2,2.5);
        System.out.println("Class Adapter:");
        System.out.println(figure[2].area());
        System.out.println(figure[2].perimeter());
        System.out.println("Object Adapter:");
        System.out.println(figure[3].area());
        System.out.println(figure[3].perimeter());
    }

}