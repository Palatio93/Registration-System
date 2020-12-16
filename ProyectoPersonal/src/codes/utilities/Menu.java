package codes.utilities;

public class Menu {

    public void generalMenu() {
        System.out.println("What is the action you want to perform?");
        System.out.println("\t1) Create an object");
        System.out.println("\t2) See everything created");
        System.out.println("\t3) Assign");
        System.out.println("\t4) End program");
    }

    public void creationalMenu() {
        System.out.println("\t1) Create Student");
        System.out.println("\t2) Create Professor");
        System.out.println("\t3) Create Subject");
        System.out.println("\t4) Create Group");
    }

    public void showMenu() {
        System.out.println("\t1) Show all Students");
        System.out.println("\t2) Show all Professors");
        System.out.println("\t3) Show all Subjects");
        System.out.println("\t4) Show all Groups");
    }

    public void assignationMenu() {
        System.out.println("\t1) Assign student to a group");
        System.out.println("\t2) Assign professor to a group");
        System.out.println("\t3) Assign all the students to a group");
    }
}
