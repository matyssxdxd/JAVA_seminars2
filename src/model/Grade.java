package model;

public class Grade {
    private long g_ID;
    private int value;
    private Student student;
    private Course course;
    private static long idCounter = 200000;

    public Grade() {
        setG_ID();
        setValue(1);
        setStudent(new Student());
        setCourse(new Course());
    }

    public Grade(int value, Student student, Course course) {
        setG_ID();
        setValue(value);
        setStudent(student);
        setCourse(course);
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

    private void setG_ID() {
        this.g_ID = idCounter++;
    }

    public void setValue(int value) {
        this.value = (Helper.isValidValue(value)) ? value : 1;
    }

    public void setStudent(Student student) {
        this.student = (Helper.isValidStudent(student)) ? student : new Student();
    }

    public void setCourse(Course course) {
        this.course = (Helper.isValidCourse(course)) ? course : new Course();
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
