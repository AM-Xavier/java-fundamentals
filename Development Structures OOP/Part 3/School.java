public class School {
    public static void main(String[] args) {
        
        StudentData student1 = new StudentData("Alexander", 1222, 9.5);
    
        student1.showInfo();

        Exam gradStudent = new StudentGrad("Lucca", 1445, 8 );
        Exam postgradStudent = new StudentPostGrad("Bernard", 1245, 5.5);

        System.out.println(gradStudent.calculateMean());
        System.out.println(postgradStudent.calculateMean());

    }
}
