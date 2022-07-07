package employee;

import Task.Task;
import companies.Company;

import java.util.LinkedList;
import java.util.List;


public abstract class Employee {

    private String name;
    private int employeeId;
    private int salary;
    protected Company employer;
    //protected LinkedList<Task> backlog;

    Employee(String name, int employeeId, int salary, Company employer){
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
        this.setEmployer(employer);

        //FIFO - first in, first out
        //backlog = new LinkedList<>();
    }

    public void setEmployer(Company company) {
        this.employer = company;
    }

    public void addTask(Task task){
        //backlog.add(task);
    }

    public abstract Task work(); //general for taking a task
    public abstract Task work(Task task); //accepts a specific task

}
