import java.util.Scanner;

public class ProductRating {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter product price: ");
        double price = s.nextDouble();

        System.out.print("Enter product popularity: ");
        int popularity = s.nextInt();

        if (price <= 100){
            System.out.println("Low cost product.");
        }

        else if (price > 100 && price <= 500){
            System.out.println("Mid-priced product.");
        }

        else {
            System.out.println("Hight cost product.");
        }

        if (popularity >= 80){
            System.out.println("High rated product.");
        }

        else{
            System.out.println("Low rated product.");
        }
    }
}
