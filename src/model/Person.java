package model;

public class Person {

    private String name;
    private String surname;

    public Person() {
        setName("Janis");
        setSurname("Berzins");
    }

    public Person(String name, String surname) {
        setName(name);
        setSurname(surname);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = Helper.isValidName(name) ? name : "defaultName";
    }

    public void setSurname(String surname) {
        this.surname = Helper.isValidName(surname) ? surname : "defaultSurname";
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
