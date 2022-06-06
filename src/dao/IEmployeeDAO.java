package dao;

import models.users.Employee;

public interface IEmployeeDAO {

    void addEmployee(Employee employee);

    void deleteEmployee(Employee employee);

    Employee findEmployeeByDni(Integer DNI);
    void updateEmployee(Employee employee);


}
