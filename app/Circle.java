public class Circle extends Shape{
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public Circle() {}//конструктор эллипса без аргументов

    public double getArea(){
        double s=0;
        s=Math.PI*Math.pow(r,2);
        return s;

    }

}
