public class Students {
    public String id;
    String firstName;
    String lastName;
    int birthDate;
    private double GPA;
    public static int studCounter;

    //Constructors:
    Students(){
        studCounter++;
        id = ""; firstName = ""; lastName = ""; birthDate = 2005; GPA = 0.0; studCounter++;
    }
    Students(String id, String firstName, String lastName
            , int birthDate, double GPA){
        studCounter++;
        this.id = id; this.firstName = firstName; this.lastName = lastName;
        this.birthDate = birthDate; this.GPA = GPA; studCounter++;
    }

    //Setters:
    public void setId(String id){ this.id = id;}
    public void setFirstName(String firstName){ this.firstName = firstName;}
    public void setLastName(String lastName){ this.lastName = lastName;}
    public void setBirthDate(int birthDate){ this.birthDate = birthDate;}
    public void setGPA(double GPA){ this.GPA = GPA;}

    //Getters:
    public String getId(){ return id;}
    public String getFirstName(){ return firstName;}
    public String getLastName(){ return lastName;}
    public int getBirthDate(){ return birthDate;}
    public double getGPA(){ return GPA;}

    //Methods:
    public String getName(){ return firstName + " " + lastName;}
    public int getAge(){ return (2023 - birthDate);}
    double updateGPA(double newTermGPA){ return GPA = ((GPA + newTermGPA)/2);}
}
