package School;

public class Enrollment {
    private Student student;
    private Course course;
    private String enrollmentDate;
    private String status;

    public Enrollment() {
        this.enrollmentDate = "Undefined date";
        this.status = "Pending";
    }

    public Enrollment(Student student, Course course){
        this.student = student;
        this.course = course;
        this.enrollmentDate = "Undefined date";
        this.status = "Pending";
    }

        public Enrollment(Student student, Course course, String enrollementDate, String status){
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollementDate;
        this.status = status;
    }
    
}

    
