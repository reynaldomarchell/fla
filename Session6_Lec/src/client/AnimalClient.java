package client;

public class AnimalClient {
    public static void main(String[] args) {
        AnimalCreator creator = new AnimalCreator();

        Animal clonedSheep = creator.retrieveAnimal("sheep");
        clonedSheep.setName("Dolly");
        clonedSheep.helloAnimal();

        Animal clonedChicken = creator.retrieveAnimal("chicken");
        clonedChicken.setName("Chickadee");
        clonedChicken.helloAnimal();
    }
}