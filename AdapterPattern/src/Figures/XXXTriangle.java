package Figures;

public class XXXTriangle {
    private double base;
    private double altezza;
    private double lato2;
    private double lato3;

    public XXXTriangle(double base, double altezza, double lato2, double lato3) {
        if (!(base < (double)0.5F) && !(altezza < (double)0.5F) && !(lato2 < (double)0.5F) && !(lato3 < (double)0.5F)) {
            this.base = base;
            this.altezza = altezza;
            this.lato2 = lato2;
            this.lato3 = lato3;
        } else {
            throw new IllegalArgumentException("Dati non corretti!");
        }
    }

    public double getBase() {
        return this.base;
    }

    public double getAltezza() {
        return this.altezza;
    }

    public double getLato2() {
        return this.lato2;
    }

    public double getLato3() {
        return this.lato3;
    }

    public double computeArea() {
        System.out.println("Area del triangolo: ");
        return Math.round((base * altezza / 2)* 1000.0) / 1000.0;
    }

    public double computePerimeter() {
        System.out.println("Perimetro del triangolo: ");
        return Math.round((base + lato2 + lato3) * 1000.0) / 1000.0;
    }
}
