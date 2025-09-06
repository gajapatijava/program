// Class with constructor
public class Car {
    String model;
    int year;

    // Default constructor
 /*   public Car() {
        model = "Unknown";
        year = 0;
    } */

    // Parameterized constructor
  /*  public Car(String m, int y) {
        model = m;
        year = y;
    } */

    // Method to display car details
    public void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    // Main method to test constructors
    public static void main(String[] args) {
        Car car1 = new Car();  // calls default constructor
      //  Car car2 = new Car("Toyota Camry", 2023);  // calls parameterized constructor

        car1.display();
    //    car2.display();
    }
}
