import java.util.Scanner;

public class WeekDay{

    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int day = i.nextInt();

        switch(day){
            case 1:
            System.out.println("Today is monday.");
            break;

            case 2:
            System.out.println("Today is tuesday");
            break;

            case 3:
            System.out.println("Today is wednesday");
            break;

            default:
            System.out.println("Invalid day");
            break;

        }
    }
}
