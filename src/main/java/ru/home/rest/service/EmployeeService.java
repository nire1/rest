package ru.home.rest.service;

import ru.home.rest.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee getById(Long id);
    void save(Employee employee);
    void delete(Long id);
    List<Employee>getAll();
}
