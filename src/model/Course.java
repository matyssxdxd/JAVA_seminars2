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
        this.creditPoints = 1;
        this.professor = null;
    }

    public Course(String title, int creditPoints, Professor professor) {
        this();
        this.title = (isValidTitle(title)) ? title : "defaultTitle";
        this.creditPoints = (isValidCreditpoints(creditPoints)) ? creditPoints : 1;
        this.professor = (isValidProfessor(professor)) ? professor : null;
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
        this.creditPoints = (isValidCreditpoints(creditPoints)) ? creditPoints : 1;
    }

    public void setProfessor(Professor professor) {
        this.professor = (isValidProfessor(professor)) ? professor : null;
    }

    private boolean isValidTitle(String title) {
        return title != null && title.matches("[A-Z]{1}[a-z]+");
    }

    private boolean isValidProfessor(Professor professor) {
        return professor != null;
    }

    private boolean isValidCreditpoints(int creditPoints) {
        return creditPoints > 0;
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
