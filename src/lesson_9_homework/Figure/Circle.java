package lesson_9_homework.Figure;

public class Circle extends Figure {
    double Radius;

    public Circle(double Radius){
        this.Radius = Radius;
    }

    @Override
    public double calculateArea() {
        return (3.14 * Radius * Radius);
    }

    @Override
    public double calculatePerimeter() {
        return (2 *3.14 * Radius);
    }
}


