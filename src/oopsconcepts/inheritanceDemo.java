package oopsconcepts;


public class inheritanceDemo {

    public static void main(String[] args) {

        int speed = 0;
        Cars c1 = new Cars(speed);
        c1.increaseSpeed();

        BMW bmw1 = new BMW(speed);
        bmw1.increaseSpeed();
        bmw1.displayNavigation();
    }
}
