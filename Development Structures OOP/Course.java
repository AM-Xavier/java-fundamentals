public class Course {

    private String courseName;
    private String professorCharge;
    private int courseCode;
    private double durationHours;
    
    public Course (String courseName, int courseCode, double durationHours, String professorCharge){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.durationHours = durationHours;
        this.professorCharge = professorCharge;
    }

    public Course (String courseName, int courseCode, double durationHours){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.durationHours = durationHours;
        this.professorCharge = "Undefined professor in charge";
    }

        public Course (String courseName, int courseCode){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.durationHours = 0.0;
        this.professorCharge = "Undefined professor in charge";
    }

        public Course (String courseName){
        this.courseName = courseName;
        this.courseCode = 0;
        this.durationHours = 0.0;
        this.professorCharge = "Undefined professor in charge";
    }

    public Course (){
        this.courseName = "Undefined course name";
        this.courseCode = 0;
        this.durationHours = 0.0;
        this.professorCharge = "Undefined professor in charge";
    }

}
