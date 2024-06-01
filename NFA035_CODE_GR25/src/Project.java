
public class Project {
    private String name;

    public Project(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    @Override
    public String toString() {
        return name;
    }
}