package lesson_8_homework;

 class Dog extends Animal{
private Dog(){
}

public static Dog Dog2(){
    return new Dog();
}
@Override
void voice() {
    System.out.println("WOOF");
}

@Override
void eat(String food) {
    if (food.equals("Meat")) {
        System.out.println("Dog like eat meat");
    } else {
        System.out.println("Dog don't like eat ");
     }
    }
}




