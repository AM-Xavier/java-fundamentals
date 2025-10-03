import java.util.ArrayList;
import java.util.List;

interface Observer{
    void update(String message);
}

class Scheduling{
    private String date;
    private String hour;
    private String doctor;
    private String pacient;
    private List<Observer> observators = new ArrayList<>();

    public void addObserver(Observer observer){
        observators.add(observer);
    }

    public void removeObserver(Observer observer){
        observators.remove(observer);
    }

    public void notifyObservers(){
        for (Observer observer : observators){
            observer.update("New appointment: " + pacient + " with Doctor " + doctor + " on " + date + "at " + hour);
        }
    }

    public void scheduleAppointment(String pacient, String doctor, String date, String hour){
        this.pacient = pacient;
        this.doctor = doctor;
        this.date = date;
        this.hour = hour;
        notifyObservers();
    }
}

class Pacient implements Observer {
    private String name;

    public Pacient(String name){
        this.name = name;
    }

    @Override
    public void update(String message){
        System.out.println("Pacient " + name + " received notification - " + message);
    }
}

class Doctor implements Observer{
    private String name;

    public Doctor(String name){
        this.name = name;
    }

    @Override
    public void update(String message){
        System.out.println("Doctor " + name + " received notification - " + message);
    }
}

public class ClinicSystem {
    public static void main(String[] args) {
        Scheduling scheduling = new Scheduling();

        Pacient pacient1 = new Pacient("Robert");
        Doctor doctor1 = new Doctor("Bernard");

        scheduling.addObserver(pacient1);
        scheduling.addObserver(doctor1);

        scheduling.scheduleAppointment("Robert", "Bernard", "10/17/2025", "10:30am");
    }
}