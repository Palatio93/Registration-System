package codes.utilities;

import codes.resources.*;
import java.util.Scanner;

public class Creator {
    Scanner sc = new Scanner(System.in);
    Checker ch = new Checker();

    public Student createStudent() {
        Student tmp = new Student();

        System.out.print("Names of the student: ");
        tmp.setNames(sc.nextLine());
        System.out.print("Last names of the student: ");
        tmp.setLastNames(sc.nextLine());
        System.out.print("Student ID: ");
        tmp.setStudentID(ch.checkLong());

        return tmp;
    } // End createStudent

    public Professor createProfessor() {
        Professor tmp = new Professor();

        System.out.print("Names of the professor: ");
        tmp.setNames(sc.nextLine());
        System.out.print("Last names of the professor: ");
        tmp.setLastNames(sc.nextLine());
        System.out.print("Professor ID: ");
        tmp.setProfessorID(ch.checkLong());

        return tmp;
    }

    public Subject createSubject() {
        Subject tmp = new Subject();

        System.out.print("Key of the subject: ");
        tmp.setKeySubject(ch.checkInt());
        System.out.print("Name of the subject: ");
        tmp.setName(sc.nextLine());
        System.out.print("Number of credits: ");
        tmp.setCredits(ch.checkInt());
        System.out.print("Hours a week of the subject: ");
        tmp.setHoursWeek(ch.checkInt());
        System.out.print("Schedule of the subject: ");
        tmp.setSchedule(sc.nextLine());

        return tmp;
    }

    public Group createGroup() {
        System.out.print("Key of the group: ");
        Group tmp = new Group(ch.checkInt());

        return tmp;
    }
}
