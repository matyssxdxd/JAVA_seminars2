package model;

public class Student extends Person {
    private long st_ID;
    private static long idCounter = 10000;

    public Student() {
        super();
        setSt_ID();
    }

    public Student(String name, String surname) {
        super(name, surname)
        setSt_ID();
    }

    public long getSt_ID() {
        return st_ID;
    }

    private void setSt_ID() {
        this.st_ID = idCounter++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "st_ID=" + st_ID +
                ", " + super.toString() + '\'' +
                '}';
    }
}
