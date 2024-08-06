package Interview_2024;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeWipro {
    public int id;
    public String name;
    public Double salary;
    public int deptId;

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

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }



    public int getDeptId() {
        return deptId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", deptId=" + deptId +
                '}';
    }

    EmployeeWipro(int id, String name, Double salary, int deptId) {
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.deptId=deptId;
    }

    public static void main(String[] args) {
        List<EmployeeWipro> employeeList = Arrays.asList(new EmployeeWipro(1,"Ram",20000.00,1),
                new EmployeeWipro(2,"Ram",20000.00,1),
                new EmployeeWipro(3,"Ram",20000.00,2),
                new EmployeeWipro(4,"Ram",20000.00,3),
                new EmployeeWipro(5,"Ram",20000.00,2));

        Map<Integer, Long> res = employeeList.stream().collect(Collectors.groupingBy(EmployeeWipro::getDeptId, Collectors.counting()));
        System.out.println(res);
    }
}
