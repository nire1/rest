package ru.home.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import ru.home.rest.model.Employee;
import ru.home.rest.repository.EmployeeRepository;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Scheduled(fixedDelay = 6000)
    public void test(){
        Optional<Employee> byId = employeeRepository.findById(1L);

        System.out.println(employeeRepository.findByName("asd"));
        System.out.println(System.currentTimeMillis());
    }
}
