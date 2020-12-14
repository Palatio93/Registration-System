package codes.resources;

import java.util.ArrayList;

public class Professor extends Person{
    private long professorID;
    private ArrayList<Subject> subjects;
    private ArrayList<Group> groups;

    public void setProfessorID(long professorID) {
        this.professorID = professorID;
    }

    public long getProfessorID() {
        return professorID;
    }

    public void addSubject(Subject subj1) {
        if (subjects.size()<6) {
            subjects.add(subj1);
            System.out.println("Successfully assigned to: "+subj1.getName());
        } else
            System.out.println("You can't be assigned to more than 5 subjects.");
    }

    public void addGroup(Group group1) {
        if (groups.size()<6) {
            groups.add(group1);
            addSubject(group1.getSubject());
            System.out.println("Successfully assigned to the group: "+group1.getKeyGroup());
        } else
            System.out.println("You can't be assigned to more than 5 groups");
    }




    @Override
    public String toString() {
        return "Professor{" +
                "professorID=" + professorID +
                ", subjects=" + subjects +
                ", groups=" + groups +
                '}';
    }
}
