package model;

public class Professor {
    private long p_ID;
    private String name;
    private String surname;
    private Degree degree;
    private static long idCounter = 0;

    public Professor() {
        setP_ID();
        setName("Janis");
        setSurname("Jokdaris");
        setDegree(Degree.other);
    }

    public Professor(String name, String surname, Degree degree) {
        setP_ID();
        setName(name);
        setSurname(surname);
        setDegree(degree);
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

    private void setP_ID() {
        this.p_ID = idCounter++;
    }

    public void setName(String name) {
        this.name = (Helper.isValidName(name)) ? name : "defaultName";
    }

    public void setSurname(String surname) {
        this.surname = (Helper.isValidName(surname)) ? surname : "defaultSurname";
    }

    public void setDegree(Degree degree) {
        this.degree = (Helper.isValidDegree(degree)) ? degree : Degree.other;
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
