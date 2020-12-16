package codes.resources;

import java.util.HashMap;
import java.util.Iterator;

public class Group {
    private int keyGroup;
    private Professor proff;
    private Subject subject;
    private HashMap<Long,Student> studentsEnrolled = new HashMap<>();

    public Group() { }

    public Group(int keyGroup) {
        this.keyGroup=keyGroup;
    }

    public void setKeyGroup(int keyGroup) {
        this.keyGroup = keyGroup;
    }

    public void setProff(Professor proff) {
        this.proff = proff;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getKeyGroup() {
        return keyGroup;
    }

    public Professor getProff() {
        return proff;
    }

    public Subject getSubject() {
        return subject;
    }

    public boolean enrollStudent(Student stu1) {
        if (studentsEnrolled.size()<=50) {
            studentsEnrolled.put(stu1.getStudentID(),stu1);
            return true;
        }
        else {
            System.out.println("The group is already full. Try in another group please.");
            return false;
        }
    }

    public void addStudents(HashMap<Long,Student> studentsToEnroll) {
        studentsEnrolled.putAll(studentsToEnroll);
    }

    public String toFileStudents() {
        String line="";
        Iterator<Student> iter = studentsEnrolled.values().iterator();
        while (iter.hasNext()) {
            Student temp = iter.next();
            line += temp.printFile();
        }
        return line;
    }

    public String printFile() {
        return keyGroup+","+proff+","+subject+","+toFileStudents()+","+"\n";
    }

    public String simplePrint() {
        return "Key group: "+keyGroup+" Subject: "+subject+".";
    }

    @Override
    public String toString() {
        return "Group{" +
                "keyGroup=" + keyGroup +
                ", proff=" + proff +
                ", subject=" + subject +
                ", studentsEnrolled=" + studentsEnrolled +
                '}';
    }
}
