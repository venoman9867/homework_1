public class Triangle extends Shape{
    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h=h;
    }

    public double getArea(){
        double s=0;
        s=0.5*a*h;
        return s;
    }
}
