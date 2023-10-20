
public class Persons {
    private String name;
    private String address;

    public Persons(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName(){ return name;}
    public String getAddress(){ return address;}

    void setAddress(String address){ this.address = address;}

    public String toString(){ return "Person{name'" + getName() + '\'' + ", address: " + getAddress() + '}';}
}
