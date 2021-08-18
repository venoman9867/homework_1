public class Rectangle extends Shape{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b=b;
    }
    public double getArea(){
        double s=0;
        s=a*b;
        return s;
    }
}
