public class Student extends Persons{
    private int numCourses;
    private String[] courses;
    private int[] grades;
    private static final int MAX_COURSES = 30;

    public Student(String name, String address) {
        super(name, address);
        courses = new String[MAX_COURSES];
        grades = new int[MAX_COURSES];
    }

    public String toString(){ return "Student{name'" + getName() + '\'' + ", address: " + getAddress() + "#ofCourses = " + numCourses + '}';}
    public void addCourseGrade(String course, int grade){
        courses[numCourses] = course;
        grades[numCourses] = grade;
        numCourses++;
    }
    public void printGrades(){
        for(int i = 0; i < numCourses; i++){
            System.out.println("Course name: " + courses[i] + ", grade = " + grades[i]);
        }
    }
    public double getAverageGrade(){
        double sum = 0.0;
        for(int i = 0; i < numCourses; i++){
            sum += grades[i];
        }
    return sum / numCourses;}
}
