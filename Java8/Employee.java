package Java8;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    public Long id;
    public String name;
    public String city;
    public Long salary;
    public String department;

    public Employee(){
        this.id = 0L;
        this.name = "rj";
        this.city = "Pune";
        this.department = "IT";
        this.salary = 17L;
    }

    public Employee(Long id, Long salary, String name, String city, String department){
        this.id = id;
        this.name = name;
        this.city = city;
        this.department = department;
        this.salary = salary;
    }

    public static List<Employee> getEmployeeList(){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1L,10L,"rj","Kol","att"));
        employees.add(new Employee(2L,15L,"rava","Kota","idp"));
        employees.add(new Employee(3L,20L,"isha","maha","sopi"));
        return employees;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
