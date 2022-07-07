import java.util.List;

public class Main {

    public static void main(String[] args){

        Corporation corp = new Corporation();
        corp.addCompany(new Company("Tesla", 100));
        corp.addCompany(new Company("Boring", 200));
        corp.addCompany(new Company("SpaceX", 300));

        Company comp = corp.getCompany("Tesla");
        comp.hire(new Employee(300, 700));
        comp.hire(new Employee(200, 900));
        comp.hire(new Employee(200, 1000));

        System.out.println(comp.getBalance());
        comp.payAll();
        System.out.println(comp.getBalance());

    }
}
