package model;

public class Helper {

    public static boolean isValidName(String name) {
        return name != null && name.matches("[A-Z]{1}[a-z]+");
    }

    public static boolean isValidDegree(Degree degree) {
        return degree != null;
    }

    public static boolean isValidValue(int value) {
        return value > 0 && value <= 10;
    }

    public static boolean isValidStudent(Student student) {
        return student != null;
    }

    public static boolean isValidCourse(Course course) {
        return course != null;
    }

    public static boolean isValidTitle(String title) {
        return title != null && title.matches("^[\\p{L}\\s]+$");
    }

    public static boolean isValidProfessor(Professor professor) {
        return professor != null;
    }

    public static boolean isValidCreditpoints(int creditPoints) {
        return creditPoints > 0 && creditPoints <= 20;
    }
}
