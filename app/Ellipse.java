public class Ellipse extends Circle{

    private double r2;

    private double a;
    private double b;

    public Ellipse(double a, double b) {

        this.a = a;
        this.b = b;

    }


    public double getArea(){
        double  s=0;
        s=Math.PI*a*b;
        return s;
    }
}
