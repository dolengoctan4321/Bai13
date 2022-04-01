package DV;

import entity.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeController {
    private List<Employee> employeeList;

    public EmployeeController() {
        this.employeeList = new ArrayList<>();
    }

    public void insert(Employee employee){
        this.employeeList.add(employee);
    }


    public Employee searchByID(String id){
        return this.employeeList.stream().filter(employee -> employee.getId().equals(id)).findFirst().orElse(null);
    }

    public boolean removeByID(String id){
        Employee employee = this.searchByID(id);
        if(employee == null){
            return false;
        }
        this.employeeList.remove(id);
        return true;
    }

    public List<Employee> searchByType(int flag){
        return this.employeeList.stream().
                filter(employee -> {
                    if (flag == 1) {
                        return employee instanceof Experience;
                    }
                    if (flag == 2) {
                        return employee instanceof Fresher;
                    }
                    if (flag == 3
                    ) {
                        return employee instanceof Intern;
                    }
                    return false;
                }).collect(Collectors.toList());
    }

    public List<Employee> searchAll(){
        return this.employeeList;
    }
}
