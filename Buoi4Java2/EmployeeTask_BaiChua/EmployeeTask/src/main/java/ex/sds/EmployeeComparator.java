package ex.sds;

import java.util.Comparator;

public class EmployeeComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        double v1 = e1.TotalValue();
        double v2 = e2.TotalValue();
        if (v1 > v2) return -1 ;
        else if (v1 < v2) return 1;
        else return 0;
    }

}
