package model;

import java.util.ArrayList;
import java.util.Arrays;

public class Course {
    private long c_ID;
    private String title;
    private int creditPoints;
    private ArrayList<Professor> professors;
    private static long idCounter = 100000;

    public Course() {
        setC_ID();
        setTitle("Matematika");
        setCreditPoints(1);
        setProfessor(new ArrayList<Professor>(Arrays.asList(new Professor())));
    }

    public Course(String title, int creditPoints, ArrayList<Professor> professor) {
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

    public ArrayList<Professor> getProfessor() {
        return professors;
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

    public void setProfessor(ArrayList<Professor> professors) {
        if (professors != null)
            this.professors = professors;
        else
            this.professors = new ArrayList<Professor>(Arrays.asList(new Professor()));
    }

    public void addProfessor(Professor professor) {
        if (!professors.contains(professor)) {
            professors.add(professor);
        }
    }

    public void removeProfessor(Professor professor) {
        if (professors.contains(professor)) {
            professors.remove(professor);
        }
    }


    @Override
    public String toString() {
        return "Course{" +
                "c_ID=" + c_ID +
                ", title='" + title + '\'' +
                ", creditPoints=" + creditPoints +
                ", professor=" + professors +
                '}';
    }
}
