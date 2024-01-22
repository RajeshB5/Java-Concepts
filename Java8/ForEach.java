package Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForEach {
    public static void main(String[] a){
        List<Integer> data = Arrays.asList(1,5,2,8,6,7);
        //Normal for loop - External loop
//        for(int i=0; i<data.size(); i++){
//            System.out.println(data.get(i));
//        }
        //Enhance for loop - External loop
//        for (Integer datum : data) {
//            System.out.println(datum);
//        }
        //ForEach loop - Internal Loop
        data.forEach(i -> System.out.println(i));  // Implementation of consumer interface
//        data.forEach(System.out::println);
        
        List<Employee> employees = Employee.getEmployeeList();

        employees.forEach(employee -> System.out.println(employee.getName()+" MO"));
        var ref = new Object() {
            Long averageSalary = 0L;
        };
        employees.forEach(employee -> ref.averageSalary += employee.getSalary());
        System.out.println(ref.averageSalary/employees.size());
    }
}
