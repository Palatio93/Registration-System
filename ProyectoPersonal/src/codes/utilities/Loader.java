package codes.utilities;

import codes.resources.*;

public class Loader {

    public void loadOldAccessories(DataBase handler) {
        loadStudents(handler);
        loadProfessors(handler);
        loadSubjects(handler);
        loadGroups(handler);
    }

    protected void loadStudents(DataBase handler) {
        Student stu1 = new Student("John", "Krasinsky", 654L);
        Student stu2 = new Student("Pepe", "Pega", 321);
        Student stu3 = new Student("Carlos", "Santana", 789);
        handler.shipStudent(stu1);
        handler.shipStudent(stu2);
        handler.shipStudent(stu3);
    }

    protected void loadProfessors(DataBase handler) {
        Professor prof1 = new Professor("Maria", "Antonieta", 1254);
        Professor prof2 = new Professor("Buzz", "Lightyear", 3214);
        handler.shipProfessor(prof1);
        handler.shipProfessor(prof2);
    }

    protected void loadSubjects(DataBase handler) {
        Subject subj1 = new Subject(3212, "EDA", 12, "3-5", "L-M-V");
        handler.shipSubject(subj1);
    }

    protected void loadGroups(DataBase handler) {
        Group group1 = new Group(1);
        Subject subj2 = new Subject(3311, "POO", 12, "11-13", "M-M-J");
        group1.setSubject(subj2);
        handler.shipSubject(subj2);
        handler.shipGroup(group1);
    }
}
