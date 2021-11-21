public class Main {
    public static void main(String[] args) {

/**
      Car audi = new Car(100,1, "Audi", true);                                 //tworzymy obiekt typu car//
        audi.startEngine();
        audi.setLights(true);
        System.out.println(audi.returnLights());
        audi.setGear(1);
        audi.accelerate(20);                          //speed jako nazwa parametru się tak robi cyk myk malutkie jak się wpisze samą liczbę//
        audi.accelerate(20);
        audi.slowDown(10);
        audi.stopEngine();
        System.out.println("Nowy samochód");

      Car Volvo = new Car(10, 1, "v70", false);
      Volvo.slowDown(5);
      System.out.println("Nowy samochód");

      Car Opel = new Car();
        Opel.startEngine();
*/
/**
   Mazda V5 = new Mazda(2020, "v5", true, 666, "leather");
   V5.startEngine();

   Vehicle Tesla = new Vehicle(2000, "d", false, 55);
   Tesla.startEngine();

   Golf GTI = new Golf(1990, "5", false, 0, Drive.FWD);
   GTI.startEngine();
    }
*/

    Cat kot = new Cat();
    kot.sound();
    kot.sleep();

    Dog pies= new Dog();
    pies.sound();
    pies.sleep();

    }
}
