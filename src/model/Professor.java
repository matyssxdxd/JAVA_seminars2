package model;

public class Professor {
    private long p_ID;
    private String name;
    private String surname;
    private Degree degree;

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

    public void setP_ID(long p_ID) {
        this.p_ID = p_ID;
    }

    public void setName(String name) throws Exception {
        if (!name.chars().allMatch(Character::isLetter)) throw new Exception("Name should only contain letters");
        this.name = name;
    }

    public void setSurname(String surname) throws Exception {
        if (!name.chars().allMatch(Character::isLetter)) throw new Exception("Surname should only contain letters");
        this.surname = surname;
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }
}
