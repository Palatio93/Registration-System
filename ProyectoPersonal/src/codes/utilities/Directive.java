package codes.utilities;

import codes.resources.*;

public class Directive {
    Menu waiter = new Menu();
    Checker ch = new Checker();
    DataBase db = new DataBase();
    Loader atlas = new Loader();

    public void load() {
        atlas.loadOldAccessories(db);
    }

    public void creator() {
        waiter.creationalMenu();
        System.out.print("Type in your choice: ");
        int choice = ch.checkInt();

        switch (choice) {
            case 1: // Create Student
                db.addStudent();
                break;
            case 2: // Create Professor
                db.addProfessor();
                break;
            case 3: // Create Subject
                db.addSubject();
                break;
            case 4: // Create Group
                db.addGroup();
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }

    }   // End creator

    public void showCase() {
        waiter.showMenu();
        System.out.print("Type in your choice: ");
        int choice = ch.checkInt();

        switch (choice) {
            case 1: // Show Students
                db.showStudents(true);
                break;
            case 2: // Show Professors
                db.showProfessors(true);
                break;
            case 3: // Show Subjects
                db.showSubjects(true);
                break;
            case 4: // Show Groups
                db.showGroups(true);
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }   // End showCase

    public void assignation() {
        waiter.assignationMenu();
        System.out.print("Type in your choice: ");
        int choice = ch.checkInt();

        switch (choice) {
            case 1: // Assign Student to Group
                db.assignStudentGroup();
                break;
            case 2: // Assign Professor to Group
                db.assignProfessorGroup();
                break;
            case 3: // Assign all the Students to a Group
                db.assignAllStudentsGroup();
                break;
            case 4: // Assign a Subject to a Group
                db.assignSubjectGroup();
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }
    }
}
