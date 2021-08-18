public class Polygon extends Shape {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    private double x4;
    private double y4;
    private double x5;
    private double y5;

//shift+option+LMB
    public Polygon(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4, double x5, double y5) {
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        this.x3=x3;
        this.y3=y3;
        this.x4=x4;
        this.y4=y4;
        this.x5=x5;
        this.y5=y5;

    }

    public double getArea() {
        double s = 0;
        s=0.5*((x1*y2)+(x2*y3)+(x3*y4)+(x4*y5)+(x5*y1)-(x2*y1)-(x3*y2)-(x4*y3)-(x5*y4)-(x1*y5));
        System.out.print("площадь многоугольника ");
        return s;

    }
}
