package main;

import model.*;

public class VeA_IS {

    public static void main(String[] args) {
        Professor prof = new Professor();
        Student stud = new Student();
        Course course = new Course();
        Grade grad = new Grade();

        System.out.println(prof.toString());
        System.out.println(stud.toString());
        System.out.println(course.toString());
        System.out.println(grad.toString());

    }
}
