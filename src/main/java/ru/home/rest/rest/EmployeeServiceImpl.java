package ru.home.rest.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.home.rest.model.Employee;
import ru.home.rest.repository.EmployeeRepository;

import java.util.List;

@Service
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee getById(Long id) {
        log.info("IN EmployeeServiceImpl getById {}",id);
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Employee employee) {
        log.info("IN EmployeeServiceImpl save {}",employee);
        employeeRepository.save(employee);
    }

    @Override
    public void delete(Long id) {
        log.info("IN EmployeeServiceImpl delete {}",id);
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> getAll() {
        log.info("IN EmployeeServiceImpl getAll {}");
        return employeeRepository.findAll();
    }
}
