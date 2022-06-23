package ru.home.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.home.rest.model.Department;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

}
