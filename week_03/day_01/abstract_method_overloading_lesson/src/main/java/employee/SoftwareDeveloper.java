package employee;

import Task.Task;
import companies.Company;

public class SoftwareDeveloper extends Employee {

    public SoftwareDeveloper(String name, int employeeId, int salary, Company company){
        super(name, employeeId, salary, company);
    }

    @Override
    public Task work() {
        Task task = this.employer.getSoftwareBacklog().pop();
        //look at the list and see who is next in line
        //removed from the queue and will be dealt with
        System.out.println(task.getDescription());
        task.setIsComplete(true);
        return task;
    }

    @Override
    public Task work(Task task) { //accepts the task as an argument
        System.out.println(task.getDescription());
        task.setIsComplete(true);
        return task;
    }

}
