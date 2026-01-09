class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    // create objects
  
      System.out.println("Car 1:");
    System.out.println("Brand: " + car1.getBrand());
    System.out.println("Model: " + car1.getModel());
    System.out.println("Color: " + car1.getColor());
    System.out.println("Year: " + car1.getYear());
    System.out.println("Value: " + car1.getValue());
    car1.honk();

      System.out.println("Car 2:");
    System.out.println("Brand: " + car2.getBrand());
    System.out.println("Model: " + car2.getModel());
    System.out.println("Color: " + car2.getColor());
    System.out.println("Year: " + car2.getYear());
    System.out.println("Value: " + car2.getValue());
    car2.honk();


    // display brand, model and value of each car
       
      Car car1 = new Car("Toyota", "Corolla", "Red", 2020, 20000);
    Car car2 = new Car("BMW", "X5", "Black", 2022, 45000);
    // Display brand and model of any car with value over 30,000
     
     print("Cars with value exceeding $30,000:");
    if (car1.getValue() > 30000) {
        System.out.println("Car over $30,000: " + car1.getBrand() + " " + car1.getModel());
    }
    if (car2.getValue() > 30000) {
        System.out.println("Car over $30,000: " + car2.getBrand() + " " + car2.getModel());
    }
  }
}
	// Make BMW honk
	  print(Using car functions:);
  car2.honk();