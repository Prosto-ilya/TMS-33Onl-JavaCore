package lesson_7_homework_.Apple;

class Apple {
    private String color;


    public Apple(String color) {
        this.color = color;
    }


    public void changeColor(String newColor) {
        this.color = newColor;
    }

    @Override
    public String toString() {
        return "Apple Color: " + color ;
    }
}
