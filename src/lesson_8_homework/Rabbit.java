package lesson_8_homework;

 class Rabbit extends Animal {
    @Override
    void voice() {
        System.out.println("FFFFFFFFFFF");
    }

    @Override
    void eat(String food) {
        if(food.equals("Grass")){
            System.out.println("Rabbit like Grass");
        }else{
            System.out.println("Rabbit don't like");
        }
    }
}

