
import java.util.ArrayList;

public class City {
    private String country;
    private String cityName;
    private ArrayList<Student> studentsFromTown;

    public City(String cityName, String country){
        this.cityName = cityName;
        this.country = country;
    }

    public ArrayList<Student> getStudentsFromTown() {
        return studentsFromTown;
    }

    public void addStudentToTown(Student student){
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
