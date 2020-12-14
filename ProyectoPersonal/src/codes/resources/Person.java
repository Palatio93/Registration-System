package codes.resources;

public class Person {
    private String names;
    private String lastNames;

    public Person () {    }

    public Person (String names, String lastNames) {
        this.names = names;
        this.lastNames = lastNames;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public String getNames() {
        return names;
    }

    public String getLastNames() {
        return lastNames;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names='" + names + '\'' +
                ", lastNames='" + lastNames + '\'' +
                '}';
    }
}
