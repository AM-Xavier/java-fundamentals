public class Product {
    
    String name;
    double price;
    
    public Product (String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Product (String name) {
        this.name = name;
        this.price = 10.0; 
    }

    public Product () {
        this.name = "Notebook";
        this.price = 5.0;
    }

    public void showDetails(){
        System.out.println("Product: " + name + ", Price: R$" + price);
    }

    public static void main(String[] args) {
        Product p1 = new Product("RTX 5070 TI", 5600.0);
        Product p2 = new Product("Monitor 15'");
        Product p3 = new Product();

        
        p1.showDetails();
        p2.showDetails();
        p3.showDetails();

    }



}