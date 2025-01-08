package lesson_8_homework;

class Tiger extends Animal {

    @Override
    void voice() {
        System.out.println("RRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR");
    }

    @Override
    void eat(String food) {
        if(food.equals("Meat")){
            System.out.println("Tiger like Meat");
        }else{
            System.out.println("Tiger don't like");
        }
    }
}
