public class Student {
    private String buddy;
    private Cities hometown;
    private String name;
    private int stundentID;

    public Student(String name, int stundentID){
        this.name = name;
        this.stundentID = stundentID;
    }
/*
    public String reportBuddyName(String name){
        this.name = buddy;
        return buddy;
    }

    public Student getBuddy() {
        return buddy;
    }*/

    public Cities getHometown() {
        return hometown;
    }

    public int getStundentID() {
        return stundentID;
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
        this.stundentID = stundentID;
    }
}
