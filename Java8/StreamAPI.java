package Java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPI {
    public static void main(String[] arg){

        List<Integer> data = Arrays.asList(1,5,2,8,6,7);
        
        //Normal stream
        Stream<Integer> st = data.stream();
        st.forEach(i -> System.out.print(i+", "));
        //Count
        System.out.println(data.stream().count());
        //Sort
        data.stream().sorted().forEach(i->System.out.print(i+", "));
        //Map
        System.out.println("\n\nMap");
        // Stream<Integer> st2 = data.stream();
        // Stream<Integer> st3 = st2.map(n -> n*2);
        // st3.forEach(i -> System.out.print(i+","));
        data.stream()
            .sorted()
            .map(n -> n*2)
            .forEach(i -> System.out.print(i+", "));

        //Reduce
        System.out.println("\n\nReduce");
        int sum = data.stream()
            .map(n -> n*2)
            .reduce(0,(c,e)->c+e);
            System.out.println(sum);

        //Filter
        System.out.println("\n\n Filter");
        data.stream()
            .filter(n -> n%2==1)
            .sorted()
            .map(n -> n*2)
            .forEach(i -> System.out.print(i+", "));

        //Sort the employee record by id
        System.out.println("\n\nSort the employee record by id");
        List<Employee> employees = Employee.getEmployeeList();
        employees.stream().sorted((p1, p2)->p1.id.compareTo(p2.id)).forEach(i->System.out.print(i.id+", "));

        //List out the total count of the customers whose names are starting with "r"
        System.out.println("\n\nList out the total count of the customers whose names are starting with r");
        employees.stream().filter(n -> n.name.charAt(0)=='r').forEach(i-> System.out.print(i.name+", "));
        
    }
}
