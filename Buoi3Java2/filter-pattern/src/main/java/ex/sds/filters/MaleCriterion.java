package ex.sds.filters;

import java.util.ArrayList;
import java.util.List;

import ex.sds.employee.Employee;

public class MaleCriterion implements Criterion {

    @Override
    public List<Employee> match(List<Employee> employees) {
        // TODO : create a new List of Employee, pick only male employees in employees and return that list
        List<Employee> maleEmployees = new ArrayList<Employee>();
        for (Employee e : employees) {
            if(e.isFemale()==false){
                maleEmployees.add(e);
            }
        }
        return maleEmployees;
    }
    
}
