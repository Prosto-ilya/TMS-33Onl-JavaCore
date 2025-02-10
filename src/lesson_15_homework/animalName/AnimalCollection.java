package lesson_15_homework.animalName;

import java.util.LinkedList;

public class AnimalCollection {
    LinkedList<String> animals;

    public AnimalCollection() {
        animals = new LinkedList<>();

    }
    public void addAnimal(String animal){
        animals.add(animal);

    }
    public String removeAnimal() {
        if (!animals.isEmpty()) {
            return animals.removeFirst();
        }return null;
    }
    public void displayAnimals(){
        System.out.println("Animals in the collections " + animals);
    }
}