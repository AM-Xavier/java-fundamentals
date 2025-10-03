import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SettingsManager {
    public static void main(String[] args) {
        Scanner scanner = null;

        try {
            File file = new File("file.txt");
            scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Settings file not found!");
        } finally {
            if (scanner != null){
                scanner.close();
                System.out.println("Resource available: Scanner closed.");
            }

            else{
                System.out.println("There aren't any resources to close.");
            }
        }
    }
}
