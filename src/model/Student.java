package model;

public class Student {
    private long st_ID;
    private String string;
    private String surname;

    public Student() {}

    public Student(long st_ID, String string, String surname) {
        this.st_ID = st_ID;
        this.string = string;
        this.surname = surname;
    }

    public long getSt_ID() {
        return st_ID;
    }

    public String getString() {
        return string;
    }

    public String getSurname() {
        return surname;
    }

    public void setSt_ID(long st_ID) {
        this.st_ID = st_ID;
    }

    public void setString(String string) {
        this.string = string;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
