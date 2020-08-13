public class Driver extends Person {
    private Bike bike; 
    private String licenseID;
    private String pickUp;
    private String dropOff;
    
    public Driver(Bike bike, String licenseID, String name, String surname,String phone_number, int cash){
        super(name,surname,phone_number,cash);
        this.bike = bike;
        this.licenseID = licenseID;    
    }

    //getters and setters
    public void setBike(Bike newBike){
        this.bike = newBike;
    }
    public void setlicenseID(String newLicenseID){
        this.licenseID = newLicenseID;
    }
    public void setPickUp(String newPickUp){ 
        this.pickUp = newPickUp;
    }
    public void setDropOff(String newDropOff){ 
        this.dropOff = newDropOff;
    }

    public Bike getBike(){
        return this.bike;
    }

    public String getlicenseID(){
        return  this.licenseID;
    }

    @Override
    public String toString(){
        return super.toString() + " and I am your food delivery driver";
    }
}