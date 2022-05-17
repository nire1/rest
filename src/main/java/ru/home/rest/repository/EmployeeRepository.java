package ru.home.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.home.rest.model.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    List<Employee> findByName(String name);
}
