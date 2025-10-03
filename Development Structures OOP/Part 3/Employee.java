abstract class Employee {
    protected String name;
    protected double fullSalary;

    public Employee(String name, double fullSalary){
        this.name = name;
        this.fullSalary = fullSalary;
    }

    public String getName(){
        return name;
    }

    public abstract double calculateSalary();

    interface Taxable{
        double calculateTaxes();
    }
}
