package model;

public class Grade {
    private long g_ID;
    private int value;
    private Student student;
    private Course course;

    public Grade() {}

    public Grade(long g_ID, int value, Student student, Course course) {
        this.g_ID = g_ID;
        this.value = value;
        this.student = student;
        this.course = course;
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

    public void setG_ID(long g_ID) {
        this.g_ID = g_ID;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
