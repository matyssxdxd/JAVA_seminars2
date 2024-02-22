package model;

public class Professor {
    private long p_ID;
    private String name;
    private String surname;
    private Degree degree;

    private static long counter = 0;

    public Professor() {}

    public Professor(long p_ID, String name, String surname, Degree degree) {
        this.p_ID = p_ID;
        this.name = name;
        this.surname = surname;
        this.degree = degree;
    }

    public long getP_ID() {
        return p_ID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Degree getDegree() {
        return degree;
    }

    public void setP_ID() {
        this.p_ID = counter;
        counter++;
    }

    public void setName(String name) {
        if (name != null && name.matches("[A-Z]{1}[a-z]+"))
            this.name = name;
        else
            this.name = "default";
    }

    public void setSurname(String surname) {
        if (surname != null && surname.matches("[A-Z]{1}[a-z]+"))
            this.surname = surname;
        else
            this.surname = "default";
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }
}
