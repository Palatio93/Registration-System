package codes.utilities;

import codes.resources.*;

import java.util.HashMap;
import java.util.Iterator;

public class DataBase {
    private HashMap<Long, Student> students = new HashMap<>();
    private HashMap<Long, Professor> professors = new HashMap<>();
    private HashMap<Integer, Subject> subjects = new HashMap<>();
    private HashMap<Integer, Group> groups = new HashMap<>();
    Creator god = new Creator();
    Checker ch = new Checker();

    public void addStudent() {
        Student tmp = god.createStudent();
        students.put(tmp.getStudentID(), tmp);
    }

    public void addProfessor() {
        Professor tmp = god.createProfessor();
        professors.put(tmp.getProfessorID(), tmp);
    }

    public void addSubject() {
        Subject tmp = god.createSubject();
        subjects.put(tmp.getKeySubject(), tmp);
    }

    public void addGroup() {
        if (!subjects.isEmpty()) {
            Iterator<Subject> iter = subjects.values().iterator();
            while (iter.hasNext()) {
                Subject tmpSubject = iter.next();
                System.out.println("Key: "+tmpSubject.getKeySubject()+"- Name: "+tmpSubject.getName());
            }
            System.out.print("Please enter the key of the subject for this group: ");
            int tmpkey = ch.checkInt();

            while (!subjects.containsKey(tmpkey)) {
                System.out.print("That key is not valid, please enter a valid one: ");
                tmpkey = ch.checkInt();
            }

            Group tmp = god.createGroup(subjects.get(tmpkey));
            groups.put(tmp.getKeyGroup(), tmp);

        } else {
            System.out.println("First you need to create at least 1 subject, in order to create a group.");
        }
    }   // End addGroup

    public void showStudents(boolean all) {
        if (!students.isEmpty()) {
            System.out.println("List of the students registered");
            Iterator<Student> it = students.values().iterator();
            while (it.hasNext()) {
                if (all)
                    System.out.println(it.next());
                else
                    System.out.println(it.next().simplePrint());
            }
        } else {
            System.out.println("There are not students registered yet.");
        }
    }   // End showStudents

    public void showProfessors(boolean all) {
        if (!professors.isEmpty()) {
            System.out.println("List of the professors registered");
            Iterator<Professor> it = professors.values().iterator();
            while (it.hasNext()) {
                if (all)
                    System.out.println(it.next());
                else
                    System.out.println(it.next().simplePrint());
            }
        } else {
            System.out.println("There are not professors registered yet.");
        }
    }   // End showProfessors

    public void showSubjects(boolean all) {
        if (!subjects.isEmpty()) {
            System.out.println("List of subjects registered");
            Iterator<Subject> it = subjects.values().iterator();
            while (it.hasNext()) {
                if (all)
                    System.out.println(it.next());
                else
                    System.out.println(it.next().simplePrint());
            }
        } else {
            System.out.println("There are not subjects registered yet.");
        }
    }   // End showSubjects

    public void showGroups(boolean all) {
        if (!groups.isEmpty()) {
            System.out.println("List of groups registered");
            Iterator<Group> it = groups.values().iterator();
            while (it.hasNext()) {
                if (all)
                    System.out.println(it.next());
                else
                    System.out.println(it.next().simplePrint());
            }
        } else {
            System.out.println("There are not groups registered yet.");
        }
    }   // End showGroups

    public void assignStudentGroup() {
        if (!groups.isEmpty() && !students.isEmpty()) {
            showGroups(false);
            System.out.print("Enter the key group where you want to assign a student: ");
            int keyGrouptmp = ch.checkInt();
            while (!groups.containsKey(keyGrouptmp)) {
                System.out.println("That is not a valid key group.");
                System.out.print("Enter a valid one: ");
                keyGrouptmp = ch.checkInt();
            }
            Group tmpGroup = groups.get(keyGrouptmp);

            showStudents(false);
            System.out.println("Enter the Student ID that you want to assign to the group "+tmpGroup.getKeyGroup());
            long StuIDtmp = ch.checkLong();
            while (!students.containsKey(StuIDtmp)) {
                System.out.println("That is not a valid student id");
                System.out.print("Enter a valid one: ");
                StuIDtmp = ch.checkInt();
            }
            Student tmpStu = students.get(StuIDtmp);
            if (tmpGroup.enrollStudent(tmpStu)) {
                tmpStu.addSubject(tmpGroup.getSubject());
                tmpStu.addGroup(tmpGroup.getKeyGroup());
                System.out.println("The student with ID"+StuIDtmp+" has been assigned to the group "+tmpGroup.getKeyGroup());
            }
        } else {
            if (groups.isEmpty())
                showGroups(false);
            if (students.isEmpty())
                showStudents(false);
        }
    }   // End assignStudentGroup

    public void assignProfessorGroup() {
        if (!groups.isEmpty() && !professors.isEmpty()) {
            showGroups(false);
            System.out.print("Enter the key group where you want to assign a professor: ");
            int keyGrouptmp = ch.checkInt();
            while (!groups.containsKey(keyGrouptmp)) {
                System.out.println("That is not a valid key group.");
                System.out.print("Enter a valid one: ");
                keyGrouptmp = ch.checkInt();
            }
            Group tmpGroup = groups.get(keyGrouptmp);

            showProfessors(false);
            System.out.println("Enter the Professor ID that you want to assign to the group "+tmpGroup.getKeyGroup());
            long ProfIDtmp = ch.checkLong();
            while (!professors.containsKey(ProfIDtmp)) {
                System.out.println("That is not a valid professor id");
                System.out.print("Enter a valid one: ");
                ProfIDtmp = ch.checkLong();
            }
            Professor tmpProf = professors.get(ProfIDtmp);
            tmpGroup.setProff(tmpProf);
            tmpProf.addSubject(tmpGroup.getSubject());
            tmpProf.addGroup(keyGrouptmp);
            System.out.println("The professor with ID "+ProfIDtmp+" has been assigned to the group "+tmpGroup.getKeyGroup());
        } else {
            if (groups.isEmpty())
                showGroups(false);
            if (professors.isEmpty())
                showProfessors(false);
        }
    }   // End assignProfessorGroup

    public void assignAllStudentsGroup() {
        if (!students.isEmpty() && !groups.isEmpty()) {
            showGroups(false);
            System.out.print("Enter the key group where you want to assign the students: ");
            int keyGrouptmp = ch.checkInt();
            while (!groups.containsKey(keyGrouptmp)) {
                System.out.println("That is not a valid key group.");
                System.out.print("Enter a valid one: ");
                keyGrouptmp = ch.checkInt();
            }
            Group tmpGroup = groups.get(keyGrouptmp);

            Iterator<Student> itStudent = students.values().iterator();

            while (itStudent.hasNext()) {
                Student tmpStudent = itStudent.next();
                boolean hasSpace = tmpGroup.enrollStudent(tmpStudent);
                tmpStudent.addSubject(tmpGroup.getSubject());
                tmpStudent.addGroup(tmpGroup.getKeyGroup());
                if (!hasSpace)
                    break;
            }
        } else {
            if (groups.isEmpty())
                showGroups(false);
            if (students.isEmpty())
                showStudents(false);
        }
    }   // End assignAllStudentsGroup

}
