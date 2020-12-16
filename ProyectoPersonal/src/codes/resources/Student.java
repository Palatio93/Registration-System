package codes.resources;

import java.util.HashSet;
import java.util.Set;

public class Student extends Person{
    private long studentID;
    private Set<Subject> subjects = new HashSet<>();
    private Set<Integer> groups = new HashSet<>();

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public long getStudentID() {
        return studentID;
    }

    public void addSubject(Subject sub1) {
        if (subjects.size()<7) {
            subjects.add(sub1);
//            System.out.println("You are now enrolled to: "+sub1.getName());
        }
        else
            System.out.println("The limit of subjects per semester is 6. You can't enroll more.");
    }

    public void addGroup(int keygroup) {
        if (groups.size()<7) {
            groups.add(keygroup);
//            System.out.println("You are now enrolled to the group: "+keygroup);
        } else
            System.out.println("You can't enroll to more groups. The limit is 6.");
    }

    public String toFileSubjects() {
        String line="";
        for (Subject sub: subjects) {
            line += sub.getKeySubject();
        }
        return line;
    }

    public String toFileGroups() {
        String line="";
        for (Integer group1 : groups) {
            line+=group1;
        }
        return line;
    }

    // TODO: Might need to print also keySubjects
    public String printFile() {
        return studentID+","+getNames()+","+getLastNames()+","+toFileGroups()+"\n";
    }

    public String simplePrint() {
        return "Student ID: "+studentID+" Name: "+getNames()+" Lastname: "+getLastNames()+".";
    }

    @Override
    public String toString() {
        return "StudentID: "+studentID+
                " Name: "+getNames()+
                " Lastname: "+getLastNames()+
                " Subjects enrolled: "+subjects+
                " Groups: "+groups+
                ".";
    }
}
