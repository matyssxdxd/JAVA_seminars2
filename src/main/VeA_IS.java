package main;

import model.*;

import java.util.ArrayList;
import java.util.Arrays;

public class VeA_IS {

    public static void main(String[] args) {
        Professor prof = new Professor();
        Student stud = new Student();
        Course course = new Course();
        Grade grad = new Grade();

        Professor prof1 = new Professor("Janis", "Uga", Degree.phd);
        Student stud1 = new Student("Juris", "Kalnins");
        Course course1 = new Course("Matematiska Analize I", 4, prof1);
        Grade grad1 = new Grade(10, stud1, course1);

        ArrayList<Professor> profList = new ArrayList<>(Arrays.asList(prof, prof1));
        ArrayList<Student> studList = new ArrayList<>(Arrays.asList(stud, stud1));
        ArrayList<Course> courseList = new ArrayList<>(Arrays.asList(course, course1));
        ArrayList<Grade> gradeList = new ArrayList<>(Arrays.asList(grad, grad1));

        for (int i = 0; i < profList.size(); i++) {
            System.out.println(profList.get(i));
            System.out.println(studList.get(i));
            System.out.println(courseList.get(i));
            System.out.println(gradeList.get(i));
            System.out.println();
        }
    }
}
