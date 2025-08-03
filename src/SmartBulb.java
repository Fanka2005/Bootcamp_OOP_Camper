public class SmartBulb {
    //Private Attributes
        private boolean status;
        private String colour;
        private double consumptionToday; //in Watts

    //Constructors
    public SmartBulb(){

    }

    //Constructors Overloading
    public SmartBulb(boolean _status, String _colour){
        this.status = _status;
        this.colour = _colour;
    }


    //Getters and Setters
    public boolean getStatus() {
        return status;
    }

    public void turnOn() {
        this.status = true;
    }

    public void turnOff() {
        this.status = false;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getConsumptionToday() {
        return consumptionToday;
    }

    public void setConsumptionToday(double consumptionToday) {
        this.consumptionToday = consumptionToday;
    }

}
