public class Employee {

    private int salary;
    private int balance;
    private Company employer;

    public Employee(int salary, int balance){
        this.salary = salary;
        this.balance = balance;
    }

    public int getSalary(){ //getter
        return salary;
    }

    public void setEmployer(Company employer) { //setter
        this.employer = employer;
    }

    public void receivePayment(int amount){
        if(amount >= salary ){
            balance += amount;
        } else {
            int def = salary - amount;
            this.employer.lodgeComplaint("My salary is " + def + "short");
        }
    }


}
