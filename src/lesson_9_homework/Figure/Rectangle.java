package lesson_9_homework.Figure;


    public class Rectangle extends Figure {
        double length;
        double width;


        public Rectangle(double length, double width){
            this.length = length;
            this.width = width;

        }

        @Override
        public double calculateArea() {
            return length * width;
        }

        @Override
        public double calculatePerimeter() {
            return (length + width) *2;
        }
    }

