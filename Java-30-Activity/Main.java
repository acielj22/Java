class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    // create objects
  
      System.out.println("Car 1:");
    System.out.println("Brand: " + car1.Brand());
    System.out.println("Model: " + car1.Model());
    System.out.println("Color: " + car1.Color());
    System.out.println("Year: " + car1.Year());
    System.out.println("Value: " + car1.Value());
    

      System.out.println("Car 2:");
    System.out.println("Brand: " + car2.Brand());
    System.out.println("Model: " + car2.Model());
    System.out.println("Color: " + car2.Color());
    System.out.println("Year: " + car2.Year());
    System.out.println("Value: " + car2.Value());
   


    // display brand, model and value of each car
       
    car1 = new Car("Toyota", "Corolla", "Red", 2020, 20000);
    car2 = new Car("BMW", "X5", "Black", 2022, 45000);

    // Display brand and model of any car with value over 30,000
     
     print("Cars with value exceeding $30,000:");
    if (car1.Value() > 30000) {
        System.out.println("Car over $30,000: " + car1.Brand() + " " + car1.Model());
    }
    if (car2.Value() > 30000) {
        System.out.println("Car over $30,000: " + car2.Brand() + " " + car2.Model());
    }
  }
}
	// Make BMW honk
	  print(Using car functions:);
  car2.honk();