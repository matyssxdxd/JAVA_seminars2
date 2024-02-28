package model;

public class Course {
    private final long c_ID;
    private String title;
    private int creditPoints;
    private Professor professor;
    private static long idCounter = 100000;

    public Course() {
        this.c_ID = idCounter++;
        this.title = "defaultTitle";
        this.creditPoints = 0;
        this.professor = null;
    }

    public Course(String title, int creditPoints, Professor professor) {
        this();
        this.title = (isValidTitle(title)) ? title : "defaultTitle";
        this.creditPoints = creditPoints;
        this.professor = professor;
    }

    public long getC_ID() {
        return c_ID;
    }

    public String getTitle() {
        return title;
    }

    public int getCreditPoints() {
        return creditPoints;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setTitle(String title) {
        this.title = (isValidTitle(title)) ? title : "defaultTitle";
    }

    public void setCreditPoints(int creditPoints) {
        this.creditPoints = creditPoints;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    private boolean isValidTitle(String title) {
        return title != null && title.matches("[A-Za-z]+");
    }

    @Override
    public String toString() {
        return "Course{" +
                "c_ID=" + c_ID +
                ", title='" + title + '\'' +
                ", creditPoints=" + creditPoints +
                ", professor=" + professor +
                '}';
    }
}
