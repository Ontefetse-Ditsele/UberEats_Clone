public class Driver extends Person {
    private String licenseID;
    private String pickUp;
    private String dropOff;
    
    public Driver(String licenseID, String name, String surname,String phone_number, int cash){
        super(name,surname,phone_number,cash);
        this.licenseID = licenseID;    
    }

    //getters and setters

    public void setlicenseID(String newLicenseID){
        this.licenseID = newLicenseID;
    }
    public void setPickUp(String newPickUp){ 
        this.pickUp = newPickUp;
    }
    public void setDropOff(String newDropOff){ 
        this.dropOff = newDropOff;
    }
    public String getlicenseID(){
        return  this.licenseID;
    }

    @Override
    public String toString(){
        return super.toString() +"Pick up:"+ this.pickUp +"" +this.dropOff;
    }
}