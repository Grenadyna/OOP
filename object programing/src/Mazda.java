                                                //dziedziczenie//
public class Mazda extends Vehicle {

    private String typeOfSeats;

    public Mazda (int dateOfProduction, String model, boolean airCon, int mileage, String typeOfSeats) {
        super (dateOfProduction, model, airCon, mileage);                                   //odnosi się do wartości w klasie nadrzędnej (rodzica) //
        this.typeOfSeats = typeOfSeats;
    }

    @Override
   public void startEngine(){
       System.out.println("brum brum");
   }

}
