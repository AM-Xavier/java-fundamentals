abstract class Researcher{
    protected String name;
    protected String researchField;
    protected int numberOfProjects;

    public Researcher(String name, String researchField, int numberOfProjects){
        this.name = name;
        this.researchField = researchField;
        this.numberOfProjects = numberOfProjects;
    }

    public abstract double calculateFunding();
    
    static class DoctorateResearcher extends Researcher{
        public DoctorateResearcher(String name, String researchField, int numberOfProjects){
            super(name, researchField, numberOfProjects);
        }
        
        @Override
        public double calculateFunding(){
            return numberOfProjects * 15000.0;
        }
    }

    static class MasterResearcher extends Researcher{
        public MasterResearcher(String name, String researchField, int numberOfProjects){
            super(name, researchField, numberOfProjects);
        }

        @Override
        public double calculateFunding(){
            return numberOfProjects * 10000.0;
        }
    }
    
}
    
    class Main{
        public static void main(String[] args) {
        
            Researcher doctorate = new Researcher.DoctorateResearcher("Dr. Munchkin", "Geografy", 7);
            Researcher master = new Researcher.MasterResearcher("Master Hillbert", "Biology", 4);
        
        
            System.out.println(doctorate.name + " - Funding: USD " + doctorate.calculateFunding());
            System.out.println(master.name + " - Funding: USD " + master.calculateFunding());
        }
    }
