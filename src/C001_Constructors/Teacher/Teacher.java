package C001_Constructors.Teacher;

public class Teacher {
    private String firstName;
    private String lastName;
    private String branch;
    private int id;
    private int experience;
    private double salary;
    private boolean isRetired;

    public Teacher() {
    }

    public Teacher(String first, String lastName, String branch, int id, int experience, double salary, boolean isRetired) {
        this.firstName = first;
        this.lastName = lastName;
        this.branch = branch;
        this.id = id;
        this.experience = experience;
        this.salary = salary;
        this.isRetired = isRetired;
    }

    public String getFirst() {
        return firstName;
    }

    public void setFirst(String first) {
        this.firstName = first;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isRetired() {
        return isRetired;
    }

    public void setRetired(boolean retired) {
        isRetired = retired;
    }

    @Override
    public String toString() {
        return "Teacher;" +
                "\nfirstName='" + firstName + '\'' +
                "\nlastName='" + lastName + '\'' +
                "\nbranch='" + branch + '\'' +
                "\nid=" + id +
                "\nexperience=" + experience +
                "\nsalary=" + salary +
                "\nisRetired=" + isRetired;
    }
}
