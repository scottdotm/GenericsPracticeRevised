package LAb;

import common.Employee;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Scott
 */
public class Challenge4 {

    public static void main(String[] args) {
        Employee e1 = new Employee("Mike", "Mick", "111-11-1111");
        Employee e2 = new Employee("Jones", "John", "222-22-2222");
        Employee e3 = new Employee("Peterson", "Amy", "333-33-3333");
        Employee e4 = new Employee("Clevelend", "Rory", "444-44-4444");
        Employee e5 = new Employee("Lemmings", "John", "444-44-4444");

        Set<Employee> emps = new HashSet<Employee>();
        emps.add(e1);
        emps.add(e2);
        emps.add(e3);
        emps.add(e4);
        emps.add(e5);

        for (Employee e : emps) {
            System.out.println(e + "\n");
            
        }
        
    }
}