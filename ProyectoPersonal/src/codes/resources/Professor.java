package codes.resources;

import java.util.HashSet;
import java.util.Set;

public class Professor extends Person{
    private long professorID;
    private Set<Subject> subjects = new HashSet<>();
    private Set<Integer> groups = new HashSet<>();

    public void setProfessorID(long professorID) {
        this.professorID = professorID;
    }

    public long getProfessorID() {
        return professorID;
    }

    public void addSubject(Subject subj1) {
        if (subjects.size()<6) {
            subjects.add(subj1);
//            System.out.println("Successfully assigned to: "+subj1.getName());
        } else
            System.out.println("You can't be assigned to more than 5 subjects.");
    }

    public void addGroup(int keygroup) {
        if (groups.size()<6) {
            groups.add(keygroup);
//            System.out.println("Successfully assigned to the group: "+keygroup);
        } else
            System.out.println("You can't be assigned to more than 5 groups");
    }

    public String simplePrint() {
        return "Professor ID: "+professorID+" Name: "+getNames()+" Lastname: "+getLastNames()+".";
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
