// import java.util.*;
// class Car{
//    String make;
//    String model;
//    int year;
//    void displayInfo(){
//     System.out.println("Make: "+make);
//     System.out.println("Model: "+model);
//     System.out.println("Year: "+year);
//    }
//    public static void main(String[] args){
//     Car c=new Car();
//     c.make="Toyota";
//     c.model="Corolla";
//     c.year=2020;
//     c.displayInfo();
//    }
// }
import java.util.*;

class Car {
    String make;
    String model;
    int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter car make: ");
        String make = sc.nextLine();

        System.out.print("Enter car model: ");
        String model = sc.nextLine();

        System.out.print("Enter car year: ");
        int year = sc.nextInt();

       
        Car c = new Car(make, model, year);

        System.out.println("\nCar Details:");
        c.displayInfo();

    
    }
}
