public class Teachers extends Persons{
    private int numCourses;
    private String[] courses;
    private static final int MAX_COURSES = 5;

    public Teachers(String name, String address) {
        super(name, address);
        numCourses = 0;
        courses = new String[MAX_COURSES];
    }

    public String toString(){ return "Teacher{name'" + getName() + '\'' +
            ", address: " + getAddress() + "#ofCourses = " + numCourses + '}';}
    public  void getCourses(){
        for(int i = 0; i < numCourses; i++){
            System.out.println((i + 1) + ". " + courses[i]);
        }
    }
    public

}
