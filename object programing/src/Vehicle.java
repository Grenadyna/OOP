public class Vehicle {
    private int dateOfProduction;
    private String model;
    private boolean airCon;
    private int mileage;

    public void startEngine(){
        System.out.println("Silnik włączon");
    }

    public void stopEngine(){
        System.out.println("Silnik zgaszon");
    }

    public int getDateOfProduction() {
        return dateOfProduction;
    }

    public String getModel() {
        return model;
    }

    public boolean isAirCon() {
        return airCon;
    }

    public int getMileage() {
        return mileage;
    }

    public void setDateOfProduction(int dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setAirCon(boolean airCon) {
        this.airCon = airCon;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
