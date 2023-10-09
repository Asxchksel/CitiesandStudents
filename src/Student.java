public class Student {
    private Student buddy;
    private Cities hometown;
    private String name;
    private int studentID;

    public Student(String name, int stundentID){
        this.name = name;
        this.studentID = stundentID;
    }

    public String reportBuddyName(){
        return buddy.getName();
    }

    public Student getBuddy() {
        return buddy;
    }

    public Cities getHometown() {
        return hometown;
    }

    public int getStundentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHometown(Cities hometown) {
        this.hometown = hometown;
    }

    public void setStundentID(int stundentID) {
        this.studentID = stundentID;
    }

    public void setBuddy(Student buddy) {
        this.buddy = buddy;
    }
}
