package services;

import models.users.Employee;

public interface IEmployeeService {

    void addEmployee(Employee employee);

    void deleteEmployee(Employee employee);

    Employee findEmployeeByDni(Integer DNI);

    void updateEmployee(Employee employee);
}
