package employee;

import Task.Task;
import companies.Company;

public class Architect extends Employee {

    public Architect(String name, int employeeId, int salary, Company company){
        super(name, employeeId, salary, company);
    }

    @Override
    public Task work() {
        Task task = this.employer.getArchBacklog().pop();
        System.out.println(task.getDescription());
        task.setIsComplete(true);
        return task;
    }

    @Override
    public Task work(Task task) {
        return null;
    }
}
