package model;

public class Course {
    private long c_ID;
    private String title;
    private int creditPoints;
    private Professor professor;
    private static long idCounter = 100000;

    public Course() {
        setC_ID();
        setTitle("Matematika");
        setCreditPoints(1);
        setProfessor(new Professor());
    }

    public Course(String title, int creditPoints, Professor professor) {
        setC_ID();
        setTitle(title);
        setCreditPoints(creditPoints);
        setProfessor(professor);
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

    private void setC_ID() {
        this.c_ID = idCounter++;
    }

    public void setTitle(String title) {
        this.title = (Helper.isValidTitle(title)) ? title : "defaultTitle";
    }

    public void setCreditPoints(int creditPoints) {
        this.creditPoints = (Helper.isValidCreditpoints(creditPoints)) ? creditPoints : 1;
    }

    public void setProfessor(Professor professor) {
        this.professor = (Helper.isValidProfessor(professor)) ? professor : new Professor();
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
