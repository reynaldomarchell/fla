package client;

public class AnimalCreator {
    private Animal sheep;
    private Animal chicken;

    public AnimalCreator() {
        sheep = new Sheep();
        chicken = new Chicken();
    }

    public Animal retrieveAnimal(String type) {
        if (type.equalsIgnoreCase("sheep")) {
            return (Animal) sheep.clone();
        } else if (type.equalsIgnoreCase("chicken")) {
            return (Animal) chicken.clone();
        }
        return null;
    }
}

