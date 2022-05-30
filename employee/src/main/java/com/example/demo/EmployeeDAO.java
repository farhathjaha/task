package com.example.demo;
import org.springframework.stereotype.Repository;
 
@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();
     
    static
    {
        list.getEmployeeList().add(new Employee(1, "farhath", "jaha", "fj@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Nusrath", "jaha", "abc@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "zayn", "malik", "zm@gmail.com"));
    }
     
    public Employees getAllEmployees() 
    {
        return list;
    }
     
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}