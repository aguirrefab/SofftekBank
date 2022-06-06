package services;

import dao.EmployeeDAO;
import models.users.Employee;

public class EmployeeService implements IEmployeeService {

    private EmployeeDAO employeeDAO;

    public EmployeeService(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeDAO.addEmployee(employee);
    }
    @Override
    public void deleteEmployee(Employee employee) {
        employeeDAO.deleteEmployee(employee);

    }
    @Override
    public Employee findEmployeeByDni(Integer DNI) {
        return employeeDAO.findEmployeeByDni(DNI);
    }
    @Override
    public void updateEmployee(Employee employee) {
        employeeDAO.updateEmployee(employee);
    }
}