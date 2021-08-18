import java.util.Scanner;
//дописать еще 3 класса полигон по формуле Гаусса,изменить элипс на основе двух радиусов, написать класс треугольника,
//прямоугольник
public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        Circle a = new Circle(6);
        Ellipse b = new Ellipse(4,8);
        Polygon c = new Polygon(-3,5,4,2,1,6,7,8,9,10);
        Triangle d=new Triangle(3,6);
        Rectangle e=new Rectangle(8,6);
         Main l=new Main();
        shapes[0] = a;
        shapes[1] = b;
        shapes[2] = c;
        shapes[3] = d;
        shapes[4] = e;

       l.draw(shapes);


//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Программа вычисляет площади фигур.");
//        System.out.println("Выберите фигуру для вычислений: \n1.Круг\n2.Эллипс\n3.Многоугольник");
//        int number=scanner.nextInt();
//        //сюда бы еще исключение забабахать, но увы, мои знание слишком скудны)
//        switch(number) {
//            case (1):
//                a.getArea();
//                break;
//            case (2):
//                b.getArea();
//                break;
//            case(3):
//                c.getArea();
//                break;
//        }  //пробовал свитч кейз


    }

    public void draw(Shape[] shapes) {
        for (Shape s : shapes){
            System.out.println(s.getArea());
        }
    }
}
