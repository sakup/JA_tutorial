package oopsconcepts;


public class BMW extends Cars{

    public BMW(int startspeed) {
        super(startspeed);
    }

    @Override
    public void increaseSpeed() {
    System.out.println("Increasing speed of BMW");

    }

    public void displayNavigation() {
        System.out.println("BMW Specific Functionslity");
    }
}
