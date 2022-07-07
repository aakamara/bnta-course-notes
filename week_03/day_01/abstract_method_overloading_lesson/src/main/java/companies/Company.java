package companies;

import Task.ArchitecturalTask;
import Task.EngineeringTask;
import Task.SoftwareTask;
import employee.Employee;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Company {

    // Liskov substitution principle
    List<Employee> employees;
    protected LinkedList<SoftwareTask> softwareBacklog = new LinkedList<>();
    protected LinkedList<ArchitecturalTask> archBacklog = new LinkedList<>();
    protected LinkedList<EngineeringTask> engineeringBacklog = new LinkedList<>();

    public Company(){
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    public List<Employee> getEmployees(){
        return this.employees;
    }

    public LinkedList<SoftwareTask> getSoftwareBacklog(){
        return softwareBacklog;
    }

    public LinkedList<ArchitecturalTask> getArchBacklog() {
        return archBacklog;
    }

    public LinkedList<EngineeringTask> getEngineeringBacklog() {
        return engineeringBacklog;
    }


}
