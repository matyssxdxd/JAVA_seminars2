package model;

public class Professor {
    private final long p_ID;
    private String name;
    private String surname;
    private Degree degree;
    private static long idCounter = 0;

    public Professor() {
        this.p_ID = idCounter++;
        this.name = "defaultName";
        this.surname = "defaultSurname";
        this.degree = null;
    }

    public Professor(String name, String surname, Degree degree) {
        this();
        this.name = (isValidName(name)) ? name : "defaultName";
        this.surname = (isValidName(surname)) ? surname : "defaultSurname";
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

    public void setName(String name) {
        this.name = (isValidName(name)) ? name : "defaultName";
    }

    public void setSurname(String surname) {
        this.surname = (isValidName(surname)) ? surname : "defaultSurname";
    }

    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    private boolean isValidName(String name) {
        return name != null && name.matches("[A-Za-z]+");
    }

    @Override
    public String toString() {
        return "Professor{" +
                "p_ID=" + p_ID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", degree=" + degree +
                '}';
    }
}
