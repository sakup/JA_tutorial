package oopsconcepts;


public class ClassDemo {

    public static void main(String[] args) {
        Car bmw = new Car(); // Create and initialize the object
        bmw.setMake("BMW");
        System.out.println("Make of BMW is " + bmw.getMake());
        System.out.println("Model of BMW is " + bmw.getModel());
        System.out.println("Gear is " + bmw.speed);
        System.out.println("Speed is " + bmw.gear);

        Car benz = new Car(10,1);
        benz.setMake("Benz");
        System.out.println("Make of Benz is " + benz.getMake());

        benz.setModel("G63");
        System.out.println("Model of Benz is " +benz.getModel());

        benz.setYear(1820);
        System.out.println("Year of Benz is " + benz.getYear());
        System.out.println("Speed is " + benz.speed);
        System.out.println("Gear is " + benz.gear);
    }

}
