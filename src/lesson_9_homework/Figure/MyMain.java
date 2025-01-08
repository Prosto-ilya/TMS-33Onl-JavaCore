package lesson_9_homework.Figure;

public class MyMain {
    public static void main(String[] args){
        System.out.println("--------------------START TEST-----------------------------------------");
        Triangle triangle= new Triangle(2, 3, 4);
        System.out.println("Площадь заданного треугольника: " + triangle.calculateArea());
        System.out.println("Периметр заданного треугольника: " + triangle.calculatePerimeter());
        System.out.println("--------------------------------------------------------------");
        Rectangle rectangle = new Rectangle(2,1);
        System.out.println("Периметр заданного прямоугольника: " + rectangle.calculatePerimeter());
        System.out.println("Площадь заданного прямоугольника: " + rectangle.calculateArea());
        System.out.println("---------------------------------------------------------------");
        Circle circle=new Circle(4);
        System.out.println("Длина окружности:" + circle.calculatePerimeter());
        System.out.println("Площадь заданной окружности: " + circle.calculateArea());
        System.out.println("----------------------TEST END---------------------------------------");


    Figure[] figures = new Figure[3];
    figures[0] = new Triangle(3, 4, 5);
    figures[1] = new Rectangle(4, 5);
    figures[2] = new Circle(3);

    double totalPerimeter = 0;
        for (Figure figure : figures) {
        totalPerimeter += figure.calculatePerimeter();
    }
        double totalArea = 0;
        for (Figure figure : figures) {
            totalArea += figure.calculateArea();
        }

        System.out.println("Сумма периметров всех фигур, находящихся в массиве: " + totalPerimeter);
        System.out.println("Сумма площадей всех фигур, находящихся в массиве: " + totalArea);
}
}
