package C001_Constructors.Students;

public class Student {
    private String name;
    private String lastName;
    private int age;
    private int grade;
    private int id;
    private String address;
    private String city;

    public Student(String name, String lastName, int age, int grade, int id, String address, String city) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.grade = grade;
        this.id = id;
        this.address = address;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "**********************************************" +
                "\nStudent`s name='" + name + '\'' +
                "\nStudent`s lastName='" + lastName + '\'' +
                "\nStudent`s age=" + age +
                "\nStudent`s grade=" + grade +
                "\nStudent`s id=" + id +
                "\nStudent`s address='" + address + '\'' +
                "\nStudent`s city='" + city + '\'' + "\n" +
                "**********************************************";
    }
}
