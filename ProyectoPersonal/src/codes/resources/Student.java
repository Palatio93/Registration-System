package codes.resources;

import java.util.Set;

public class Student extends Person{
    private long studentID;
    private Set<Subject> subjects;
    private Set<Integer> groups;

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public long getStudentID() {
        return studentID;
    }

    public void addSubject(Subject sub1) {
        if (subjects.size()<7) {
            subjects.add(sub1);
            System.out.println("You are now enrolled to: "+sub1.getName());
        }
        else
            System.out.println("The limit of subjects per semester is 6. You can't enroll more.");
    }

    public void addGroup(Group group1) {
        if (groups.size()<7) {
            groups.add(group1.getKeyGroup());
            addSubject(group1.getSubject());
            System.out.println("You are now enrolled to the group: "+group1.getKeyGroup());
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


    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", subjects=" + subjects +
                ", groups=" + groups +
                '}';
    }
}
