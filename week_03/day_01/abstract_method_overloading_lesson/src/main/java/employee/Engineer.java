package employee;

import Task.Task;
import companies.Company;

public class Engineer extends Employee{

    public Engineer(String name, int employeeId, int salary, Company company){
        super(name, employeeId, salary, company);
    }

    @Override
    public Task work() {
        Task task = this.employer.getEngineeringBacklog().pop();
        System.out.println(task.getDescription());
        task.setIsComplete(true);
        return task;
    }

    @Override
    public Task work(Task task) {
        System.out.println(task.getDescription());
        task.setIsComplete(true);
        return task;
    }

}
