package codes.resources;

public class Subject {
    private int keySubject;
    private String name;
    private int credits;
    private String schedule;
    private String days;

    public Subject() {    }

    public Subject(int keySubject, String name, int credits, String schedule, String days) {
        this.keySubject = keySubject;
        this.name = name;
        this.credits = credits;
        this.schedule = schedule;
        this.days = days;
    }

    public void setKeySubject(int keySubject) {
        this.keySubject = keySubject;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public int getKeySubject() {
        return keySubject;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public String getSchedule() {
        return schedule;
    }

    public String getDays() {
        return days;
    }

    public String printFile() {
        return keySubject+","+name+","+credits+","+","+schedule+","+days+"\n";
    }

    public String simplePrint() {
        return "Key subject: "+keySubject+" Name: "+name;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "keySubject=" + keySubject +
                ", name='" + name + '\'' +
                ", credits=" + credits +
                ", schedule='" + schedule + '\'' +
                ", days='" + days + '\'' +
                '}';
    }
}
