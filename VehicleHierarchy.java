class Vehicle { 
String make; 
String model; int
year; 
 String fuelType; 
 public Vehicle(String make, String model, int year, String fuelType) { 
this.make = make; this.model = model; this.year = year; 
 this.fuelType = fuelType; 
 } public double
calculateFuelEfficiency() { return 0; 
 } public double calculateDistanceTraveled(double
fuelUsed) { return fuelUsed *
calculateFuelEfficiency(); 
 } public int
getMaxSpeed() { return
0; 
 } 
 public void displayInfo() { 
 System.out.println("Make: " + make); 
 System.out.println("Model: " + model); 
 System.out.println("Year: " + year); 
System.out.println("Fuel Type: " + fuelType); 
 } 
} class Truck extends Vehicle { public Truck(String make, String
model, int year, String fuelType) { super(make, model, year, 
fuelType); 
 } 
 @Override public double
calculateFuelEfficiency() { 
 return 6.0; 
 }
 public int
getMaxSpeed() { return
120; 
 } 
} class Car extends Vehicle { public Car(String make, String
model, int year, String fuelType) { super(make, model, year, 
fuelType); 
 } 
 @Override public double
calculateFuelEfficiency() { return
15.0; 
 } 
 @Override public int
getMaxSpeed() { return
180; 
 } 
} class Motorcycle extends Vehicle { public Motorcycle(String make, 
String model, int year, String fuelType) { super(make, model, year, 
fuelType); 
 } 
 @Override public double
calculateFuelEfficiency() { return
50.0; 
 } 
 @Override public int
getMaxSpeed() { return
220; 
 } 
} public class VehicleHierarchy
{ 
 public static void main(String[] args) { 
 Truck truck = new Truck("Tata", "T-10", 2015, "Diesel"); 
 Car car = new Car("Toyota", "VX", 2022, "Diesel"); 
 Motorcycle motorcycle = new Motorcycle("Yamaha", "YZF-R1", 2021, 
"Petrol"); 
 System.out.println("Truck info:"); 
truck.displayInfo(); 
 System.out.println("Fuel Efficiency: " +
truck.calculateFuelEfficiency() + " km/l");
System.out.println("Max Speed: " + truck.getMaxSpeed() + " km/h"); 
 System.out.println("\nCar info:"); 
car.displayInfo(); 
 System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() 
+ " km/l"); 
 System.out.println("Max Speed: " + car.getMaxSpeed() + " km/h"); 
 System.out.println("\nMotorcycle info:"); 
motorcycle.displayInfo(); 
 System.out.println("Fuel Efficiency: " +
motorcycle.calculateFuelEfficiency() + " km/l"); 
 System.out.println("Max Speed: " + motorcycle.getMaxSpeed() + " 
km/h"); 
 } 
}