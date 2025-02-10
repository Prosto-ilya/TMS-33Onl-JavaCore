package lesson_15_homework.animalName;

public class AnimalName {
    public static void main(String[] args) {
        AnimalCollection animalCollection=new AnimalCollection();
            animalCollection.addAnimal("Кот");
            animalCollection.addAnimal("Собака");
            animalCollection.addAnimal("Енот");
            animalCollection.displayAnimals();
        System.out.println("Remove animal: " + animalCollection.removeAnimal());
            animalCollection.displayAnimals();


    }
}
