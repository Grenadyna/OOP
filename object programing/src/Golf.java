public class Golf extends Vehicle {

//    private String drive; /zamieniamy drive słownnego na Enuma/
    public Drive drive;

    public Golf(int dateOfProduction, String model, boolean airCon, int mileage, Drive drive) {
        super(dateOfProduction, model, airCon, mileage);
        this.drive = drive;

    }

}
