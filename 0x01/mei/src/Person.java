import java.util.Date;

public class Person {

    private String name;
    private String surname;
    private int birthDate;
    private boolean anotherCompanyOwner;
    private boolean pensioner;
    private boolean publicServer;
    private float salary;

    public Person(String name, String surname, int birthDate, boolean anotherCompanyOwner, boolean pensioner, boolean publicServer) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.anotherCompanyOwner = anotherCompanyOwner;
        this.pensioner = pensioner;
        this.publicServer = publicServer;
    }

    public String fullName() {
        return name + " " + surname;
    }

    public float getSalary() {
        return salary;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float calculateYearlySalary() {
        return getSalary() * 12;
    }

    public boolean isMEI() {
        if(calculateYearlySalary() < 130000 && birthDate >= 18 && !anotherCompanyOwner && !pensioner && !publicServer) {
            return true;
        }
        return false;
    }

}
