import java.util.ArrayList;
import java.util.List;

public class Corporation {

    List<Company> companies = new ArrayList<>();

    public List<Company> getCompanies(){
        return companies;
    }

    public void addCompany(Company company){
        companies.add(company);
    }

    public Company getCompany(String name){
        for(Company company : companies){
            if(companies.getName().equals(name)){
                return company;
            }
        }
        return null;
    }



}
