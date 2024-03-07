package model;

public class Professor extends Person {
    private long p_ID;
    private Degree degree;
    private static long idCounter = 0;

    public Professor() {
        super();
        setP_ID();
        setDegree(Degree.other);
    }

    public Professor(String name, String surname, Degree degree) {
        super(name, surname);
        setP_ID();
        setDegree(degree);
    }

    public long getP_ID() {
        return p_ID;
    }

    public Degree getDegree() {
        return degree;
    }

    private void setP_ID() {
        this.p_ID = idCounter++;
    }

    public void setDegree(Degree degree) {
        this.degree = (Helper.isValidDegree(degree)) ? degree : Degree.other;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "p_ID=" + p_ID +
                ", " + super.toString() + '\'' +
                ", degree=" + degree +
                '}';
    }
}
