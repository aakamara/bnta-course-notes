import java.util.ArrayList;
import java.util.List;

public class Company {

    private String name;
    private List<Employee> employees;
    private int balance;

    public Company(String name, int balance){
        this.name = name;
        this.balance = balance;
        this.employees = new ArrayList<Employee>();
    }

    public String getName (){
        return this.name;
    }
    public int getBalance() {
        return this.balance;
    }

    public void hire(Employee candidate){ //setters and getters
        this.employees.add(candidate);
        candidate.setEmployer(this);
    }

    public void fire(Employee employee){ // setters and getters
        this.employees.remove(employee);
    }

    public void pay(Employee employee){
        if(this.balance >= employee.getSalary()) {
            balance -=employee.getSalary();
            employee.receivePayment(employee.getSalary());
        } else {
        System.out.println("Sorry, spent all the money");}
    }

    public void payAll(){
        for(Employee emp : employees){
            this.pay(emp);
        }
    }

    public void lodgeComplaint(String message){
        System.out.println(message);
    }

}
