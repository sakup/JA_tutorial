package oopsconcepts;


public class Cars {
    int speed;

    public Cars (int startSpeed) {
        speed = startSpeed;
    }

    public void increaseSpeed() {
        speed++;
        System.out.println("Increasing speed");
    }

    public void decreaseSpeed() {
        speed--;
        System.out.println("Decreasing speed");
    }
}
