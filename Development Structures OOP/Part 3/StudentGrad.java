public class StudentGrad extends StudentData implements Exam {
    
    public StudentGrad(String name, int enrollment, double grade) {
        super(name, enrollment, grade);
    }

    @Override
    public double calculateMean() {
        return getGrade() * 1.0;
    }
}
