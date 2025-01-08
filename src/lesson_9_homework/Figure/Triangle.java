package lesson_9_homework.Figure;

public class Triangle extends Figure {
    double A;
    double B;
    double C;

    public Triangle(double A, double B, double C){
        this.A=A;
        this.B=B;
        this.C=C;
    }

    @Override
    public double calculateArea() {
        double s= (A+B+C)/2;
        return Math.sqrt(s*(s-A)*(s-B)*(s-C));
    }

    @Override
    public double calculatePerimeter() {
        return A+B+C;
    }
}
