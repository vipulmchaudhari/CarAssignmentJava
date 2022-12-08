package car.model;

public class Car {
    private String name;
    private int noOfSeat;

    private Double currentSpeed;

    private String productionNumber;
    private String horsePower;
    private String mpg;
    private String type;

    private boolean convertible;
    public Car(String name){
        productionNumber = name;
    }

    public Car(String name, int noOfSeat, String horsePower, String mpg) {
        this.name = name;
        this.noOfSeat = noOfSeat;
        this.horsePower = horsePower;
        this.mpg = mpg;
        this.currentSpeed=0.0;
    }

    public Double accelarate(Double unit){
        currentSpeed=  currentSpeed + unit;
        System.out.println(this.name +" "+currentSpeed);
        return currentSpeed;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public Double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(Double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public String getProductionNumber() {
        return productionNumber;
    }

    public void setProductionNumber(String productionNumber) {
        this.productionNumber = productionNumber;
    }
}
