import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] grades = new double[5];

        System.out.println("Enter student grades:");

        for (int i = 0; i < grades.length; i++){
            System.out.println("Student grade" + (i+1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        System.out.println("\nEnter student index to update grade (1 to 5):");
        int index = scanner.nextInt() - 1;

        if (index >= 0 && index < grades.length){
            System.out.println("Enter new grade:");
            grades[index] = scanner.nextDouble();
        } else{
            System.out.println("ERROR: Invalid index!");
        }

        double sum = 0;
        
        for (double grade : grades){
            sum += grade;
        }

        double mean = sum / grades.length;
        System.out.printf("\nClass' mean: %.2f\n", mean);

        double biggest = grades[0], smallest = grades[0];

        for (double grade : grades){
            if(grade > biggest) biggest = grade;
            if (grade < smallest) smallest = grade;
        }

        System.out.printf("Biggest grade: %.2f\n", biggest);
        System.out.printf("Smallest grade: %.2f\n", smallest);

        scanner.close();
    }
}
