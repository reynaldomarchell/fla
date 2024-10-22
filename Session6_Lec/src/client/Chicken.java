package client;

public class Chicken extends Animal {
    private int numberOfClones;

    @Override
    public void helloAnimal() {
        System.out.println("Hello, I am a Chicken.");
    }

    @Override
    public Object clone() {
        return super.clone();
    }

    // Getters and setters
    public int getNumberOfClones() {
        return numberOfClones;
    }

    public void setNumberOfClones(int numberOfClones) {
        this.numberOfClones = numberOfClones;
    }
}