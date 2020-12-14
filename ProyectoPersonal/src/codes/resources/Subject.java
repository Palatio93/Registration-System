package codes.resources;

public class Subject {
    private int keySubject;
    private String name;
    private int credits;
    private int hoursWeek;
    private String schedule;

    public Subject() {    }

    public Subject(int keySubject, String name, int credits, int hoursWeek, String schedule) {
        this.keySubject = keySubject;
        this.name = name;
        this.credits = credits;
        this.hoursWeek = hoursWeek;
        this.schedule = schedule;
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

    public void setHoursWeek(int hoursWeek) {
        this.hoursWeek = hoursWeek;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
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

    public int getHoursWeek() {
        return hoursWeek;
    }

    public String getSchedule() {
        return schedule;
    }

    public String printFile() {
        return keySubject+","+name+","+credits+","+hoursWeek+","+schedule+"\n";
    }

    @Override
    public String toString() {
        return "Subject{" +
                "keySubject=" + keySubject +
                ", name='" + name + '\'' +
                ", credits=" + credits +
                ", hoursWeek=" + hoursWeek +
                ", schedule='" + schedule + '\'' +
                '}';
    }
}
