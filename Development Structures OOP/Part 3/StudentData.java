public class StudentData {
    private String name;
    private int enrollment;
    private double grade;

    public StudentData(String name, int enrollment, double grade) {
        this.name = name;
        this.enrollment = enrollment;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        if (grade >= 0 && grade <= 10){
            this.grade = grade;
        }

        else {
            System.out.println("Invalid grade! It should be a value between 0 and 10.");
        }
    }

    public void showInfo(){
        System.out.println("Name: " + name + ", Enrollment: " + enrollment + ", Grade: " + grade);
    }
}
