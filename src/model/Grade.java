package model;

public class Grade {
    private final long g_ID;
    private int value;
    private Student student;
    private Course course;
    private static long idCounter = 200000;

    public Grade() {
        this.g_ID = idCounter++;
        this.value = 1;
        this.student = null;
        this.course = null;
    }

    public Grade(int value, Student student, Course course) {
        this();
        this.value = (isValidValue(value)) ? value : 1;
        this.student = (isValidStudent(student)) ? student : null;
        this.course = (isValidCourse(course)) ? course : null;
    }

    public long getG_ID() {
        return g_ID;
    }

    public int getValue() {
        return value;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public void setValue(int value) {
        this.value = (isValidValue(value)) ? value : 1;
    }

    public void setStudent(Student student) {
        this.student = (isValidStudent(student)) ? student : null;
    }

    public void setCourse(Course course) {
        this.course = (isValidCourse(course)) ? course : null;
    }

    private boolean isValidValue(int value) {
        return value > 0 && value <= 10;
    }

    private boolean isValidStudent(Student student) {
        return student != null;
    }

    private boolean isValidCourse(Course course) {
        return course != null;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "g_ID=" + g_ID +
                ", value=" + value +
                ", student=" + student +
                ", course=" + course +
                '}';
    }
}
