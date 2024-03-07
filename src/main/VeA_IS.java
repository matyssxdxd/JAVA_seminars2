package main;

import model.*;

import java.util.ArrayList;
import java.util.Arrays;

public class VeA_IS {

    private static final Professor prof = new Professor();
    private static final Student stud = new Student();
    private static final Course course = new Course();
    private static final Grade grad = new Grade();

    private static final Professor prof1 = new Professor("Janis", "Uga", Degree.phd);
    private static final Student stud1 = new Student("Juris", "Kalnins");
    private static final Course course1 = new Course("Matematiska Analize I", 4, prof1);
    private static final Course course2 = new Course("Matematiska Analize II", 2, prof1);
    private static final Grade grad1 = new Grade(8, stud1, course1);
    private static final Grade grad2 = new Grade(10, stud1, course2);


    private static final ArrayList<Professor> profList = new ArrayList<>(Arrays.asList(prof, prof1));
    private static final ArrayList<Student> studList = new ArrayList<>(Arrays.asList(stud, stud1));
    private static final ArrayList<Course> courseList = new ArrayList<>(Arrays.asList(course, course1, course2));
    private static final ArrayList<Grade> gradeList = new ArrayList<>(Arrays.asList(grad, grad1, grad2));

    public static void main(String[] args) {
        try {
            float averageGrade = calculateAverageGrade(stud1);
            System.out.println(averageGrade);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            float weightedAverageGrade = weightedAverageGrade(stud1);
            System.out.println(weightedAverageGrade);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            float averageGradeOfCourse = calculateAverageGradeOfCourse(course1);
            System.out.println(averageGradeOfCourse);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            int professorCourses = calcualteProfessorCourses(prof1);
            System.out.println(professorCourses);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static float calculateAverageGrade(Student student) throws Exception {
        if (!Helper.isValidStudent(student)) throw new Exception("BOO");

        float sum = 0;
        int howMany = 0;

        for (Grade grade : gradeList) {
            if(grade.getStudent().equals(student)) {
                sum += grade.getValue();
                howMany++;
            }
        }

        if (howMany == 0) throw new Exception("nava kursi");

        return sum / howMany;
    }

    private static float weightedAverageGrade(Student student) throws Exception {
        if (!Helper.isValidStudent(student)) throw new Exception("BOO");

        float sum = 0;
        int howMany = 0;

        for (Grade grade : gradeList) {
            if (grade.getStudent().equals(student)) {
                sum += grade.getCourse().getCreditPoints() * grade.getValue();
                howMany += grade.getCourse().getCreditPoints();
            }
        }

        if (howMany == 0) throw new Exception("nava kursi");

        return sum / howMany;
    }

    public static float calculateAverageGradeOfCourse(Course course) throws Exception {
        if (course == null) throw new Exception("NAE NAE");
        float sum = 0;
        int howMany = 0;

        for (Grade tempGr : gradeList) {
            if (tempGr.getCourse().equals(course)) {
                sum += tempGr.getValue();
                howMany++;
            }
        }

        if (howMany == 0) throw new Exception("WEE WOO");

        return sum / howMany;
    }

    public static int calcualteProfessorCourses(Professor professor) throws Exception {
        if (professor == null) throw new Exception("WAE WAE");
        int howMany = 0;

        for (Course course : courseList) {
            if (course.getProfessor().equals(professor)) {
                howMany += 1;
            }
        }
        if (howMany == 0) throw new Exception("WEE WOO");

        return howMany;
    }

    public static void createStudent(String name, String surname) throws Exception {
        if (name == null || surname == null) throw new Exception("NAA MAN");

        for (Student student : studList) {
            if (student.getName().equals(name) && student.getSurname().equals(surname)) {
                throw new Exception("BABA");
            }
        }

        Student st = new Student(name, surname);
        studList.add(st);
    }

    public static Student retrieveStudentBySurname(String surname) throws Exception {
        if (surname == null) throw new Exception("AHAHA");

        for (Student student : studList) {
            if (student.getSurname().equals(surname)) {
                return student;
            }
        }

        throw new Exception("BLABLA");
    }

    public static void updateStudentByNameAndSurname(String name, String surname, String newSurname) throws Exception {
        if (name == null || surname == null || newSurname == null) throw new Exception("BLABLA");

        for (Student student : studList) {
            if (student.getName().equals(name) && student.getSurname().equals(surname)) {
                if (!surname.equals(newSurname)) {
                    student.setSurname(newSurname);
                    return;
                }
            }
        }

        throw new Exception("BEE");
    }

    public static void  deleteByNameAndSurname(String name, String surname) throws Exception {
        if (name == null || surname == null) throw new Exception("BLABLA");

        for (Student student : studList) {
            if (student.getName().equals(name) && student.getSurname().equals(surname)) {
                studList.remove(student);
                return;
            }
        }

    }

    public static void sortStudentsByAverageGrade() throws Exception {

    }
}
