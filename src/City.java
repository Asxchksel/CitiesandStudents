import java.util.ArrayList;

public class City {
    private String country;
    private String cityName;
    private ArrayList<Student> studentsFromTown = new ArrayList<Student>();


    public City(String cityName, String country){
        this.cityName = cityName;
        this.country = country;
    }

    public ArrayList<Student> getStudentsFromTown() {
        Student student;
        for (int i = 0; i < studentsFromTown.size(); i++) {
            student = studentsFromTown.get(i);
            System.out.println(student.getName() + " is from " + this.cityName);
        }
        return studentsFromTown;
    }

    public void addStudentToTown(Student student){
        this.studentsFromTown = studentsFromTown;
        studentsFromTown.add(student);

    }

    public void setStudentsFromTown(ArrayList<Student> studentsFromTown) {
        this.studentsFromTown = studentsFromTown;
    }

    public String getCountry() {
        return country;
    }

    public String getCityName() {
        return cityName;
    }
}
