import companies.Company;
import employee.Architect;
import employee.Engineer;
import employee.SoftwareDeveloper;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CompanyTest {
    private Company company;

    @BeforeEach
    public void setUp(){
        company = new Company();
        company.addEmployee(new Architect("May Doe", 1234, 3500, company)); //abstract cannot be newed up
        company.addEmployee(new SoftwareDeveloper("Black Beard", 2468, 5500, company ));
        company.addEmployee(new Engineer("Jason Blue", 3699, 6500, company));
    }

    @Test
    public void addsEmployees(){
        assertThat(company.getEmployees().size()).isEqualTo(3);
    }
}
