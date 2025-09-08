package School;
public class Student {

    private String name;
    private String email;
    private int age;
    private String enrolledCourse;

    public Student() {
        this.name = "Undefined name";
        this.email = "Undefined email";
        this.age = 0;
        this.enrolledCourse = "Undefined enrolled course";
    }

    public Student(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.enrolledCourse = "Undefined enrolled course";
    }

    public Student(String name, String email, int age, String enrolledCourse) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.enrolledCourse = enrolledCourse;
    }

}
