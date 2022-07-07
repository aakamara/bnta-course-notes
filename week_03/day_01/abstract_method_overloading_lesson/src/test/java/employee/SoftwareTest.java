package employee;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import Task.SoftwareTask;
import companies.Company;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class SoftwareTest {

    private SoftwareDeveloper sd;

    @BeforeEach
    public void setUp(){
        Company company = new Company();
        sd = new SoftwareDeveloper("Jack", 2424, 4500, company);

        company.getSoftwareBacklog().add(new SoftwareTask("Write an alternate version of Google"));
        company.getSoftwareBacklog().add(new SoftwareTask("Refactor an old class"));
        company.getSoftwareBacklog().add(new SoftwareTask("Write a debug module"));
    }

    @Test
    public void canPullTask(){
        //SoftwareTask task = this.sd.employer.getSoftwareBacklog().pop();
        sd.work();
        sd.work();
        assertThat(sd.employer.getSoftwareBacklog().size()).isEqualTo(1);

    }


}
