package university;

public class Student {

    private String firstName;
    private String secondName;
    private String bestSubject;

    public Student(String firstName, String secondName, String bestSubject) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.bestSubject = bestSubject;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getBestSubject() {
        return bestSubject;
    }

    @Override
    public String toString() {
        return String.format("Student: %s %s, %s", getFirstName(), getSecondName(), getBestSubject());
    }
}
