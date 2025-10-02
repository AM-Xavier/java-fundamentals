public class StudentPostGrad extends StudentData implements Exam {

    public StudentPostGrad(String name, int enrollment, double grade) {
        super(name, enrollment, grade);
    }

    @Override
    public double calculateMean() {
        return getGrade() * 1.2;
    }
    
}
