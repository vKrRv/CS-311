public class Students {
    public String ID;
    String firstName;
    String lastName;
    int birthDate;
    private double GPA;

    //Constructors:
    Students(){
        ID = ""; firstName = ""; lastName = ""; birthDate = 2005; GPA = 0.0;
    }
    Students(String newID, String newFirstName, String newLastName
            , int newBirthDate, double newGPA){
        ID = newID; firstName = newFirstName; lastName = newLastName;
        birthDate = newBirthDate; GPA = newGPA;
    }

    //Setters:
    public void setID(String newID){ ID = newID;}
    public void setFirstName(String newFirstName){ firstName = newFirstName;}
    public void setLastName(String newLastName){ lastName = newLastName;}
    public void setBirthDate(int newBirthDate){ birthDate = newBirthDate;}
    public void setGPA(double newGPA){ GPA = newGPA;}

    //Getters:
    public String getID(){ return ID;}
    public String getFirstName(){ return firstName;}
    public String getLastName(){ return lastName;}
    public int getBirthDate(){ return birthDate;}
    public double getGPA(){ return GPA;}

    //Methods:
    public String getName(){ return firstName + " " + lastName;}
    public int getAge(){ return (2023 - birthDate);}
    double updateGPA(double newTermGPA){ return GPA = ((GPA + newTermGPA)/2);}
}
