package model;

public class Student {
    private final long st_ID;
    private String name;
    private String surname;
    private static long idCounter = 10000;

    public Student() {
        this.st_ID = idCounter++;
        this.name = "defaultName";
        this.surname = "defaultSurname";
    }

    public Student(String name, String surname) {
        this();
        this.name = (isValidName(name)) ? name : "defaultName";
        this.surname = (isValidName(surname)) ? surname : "defaultSurname";
    }

    public long getSt_ID() {
        return st_ID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = (isValidName(name)) ? name : "defaultName";
    }

    public void setSurname(String surname) {
        this.surname = (isValidName(surname)) ? surname : "defaultSurname";
    }

    private boolean isValidName(String name) {
        return name != null && name.matches("[A-Za-z]+");
    }

    @Override
    public String toString() {
        return "Student{" +
                "st_ID=" + st_ID +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
