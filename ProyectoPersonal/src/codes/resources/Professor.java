package codes.resources;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Professor extends Person{
    private long professorID;
    private Set<Subject> subjects = new HashSet<>();
    private Set<Integer> groups = new HashSet<>();

    public Professor() { }

    public Professor(String names, String lastnames, long professorID) {
        super(names, lastnames);
        this.professorID = professorID;
    }

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

    public String getSubjects() {
        String line="";
        Iterator<Subject> itSubject = subjects.iterator();
        while (itSubject.hasNext()) {
            line += itSubject.next().simplePrint();
        }
        return line;
    }

    @Override
    public String toString() {
        return "Professor ID: "+professorID+
                " Name: "+getNames()+
                " Last name: "+getLastNames()+
                " Subjects: "+getSubjects()+
                " Groups: "+groups+
                ".";
    }
}
