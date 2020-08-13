/**
 * Ontefetse Ditsele
 * 
 * Person Class : A super class to create Customer & Driver.
 * 13 August 2020
 */

public class Person {
    
    //Instanse Variables
    private String name;;
    private String surname;
    private String phone_num;
    private double cash;
    

    //Constructor
    public Person(final String name,final String surname, final String phone_num,final double cash){
        this.name = name;
        this.surname = surname;
        this.phone_num = phone_num;
        this.cash = cash;
    }
    //Set Methods
    public void setName(final String name){ this.name = name;}
    public void setSurname(final String surname){ this.surname= surname;}
    public void setGender(final String phone_num){ this.phone_num = phone_num;}
    public void setCash(final double cash){this.cash = cash;}

    //Get Methods
    public String getName(){ return this.name;}
    public String getSurname(){ return this.surname;
    }

    public String getPhoneNumber() {
        return this.phone_num;
    }

    public double getCash() {
        return this.cash;
    }

    //To String Function.
    @Override
    public String toString() {
        return this.name + " " + this.surname + " Phone No."+ this.phone_num;
    }
}
