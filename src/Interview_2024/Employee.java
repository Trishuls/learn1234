package Interview_2024;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Employee {
    public int id;
    public String name;
    public String email;
    public String domain;
    public Double salary;

    Employee(int id, String name, String email, String domain, Double salary) {
        this.id=id;
        this.name=name;
        this.email=email;
        this. domain=domain;
        this.salary=salary;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", domain='" + domain + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee(1, "Arjun","arjun@gmail.com","developer",10000.00),
                new Employee(2,"Brain","brain@gmail.com","java",20000.00), new Employee(3,"Charan","charan@gmail.com","python",5000.00));
        employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(System.out::println);
    }
}
