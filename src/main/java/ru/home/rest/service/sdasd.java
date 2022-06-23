package ru.home.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.home.rest.model.Department;
import ru.home.rest.model.Employee;
import ru.home.rest.repository.DepartmentRepository;
import ru.home.rest.repository.EmployeeRepository;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component

public class sdasd {

    private final EmployeeRepository employeeRepository;

    private final DepartmentRepository departmentRepository;

    public sdasd(EmployeeRepository employeeRepository, DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }


    public void createEmployee() {
        employeeRepository.save(Employee.builder().name("Alex").surname("Biba").sex("male").dateBirth(new Date()).phone("890256598").email("uni@mai.com").dateOfLastDay(new Date()).position("Manager").salary(BigDecimal.valueOf(130000)).build());
        employeeRepository.save(Employee.builder().name("Biba").surname("Bobol").sex("male").dateBirth(new Date()).phone("890256545").email("qweuni@mai.com").dateOfLastDay(new Date()).position("Manager").salary(BigDecimal.valueOf(130000)).build());
        employeeRepository.save( Employee.builder().name("Defa").surname("Baasa").sex("female").dateBirth(new Date()).phone("89045869s8").email("фф123@mai.com").dateOfLastDay(new Date()).position("Manager").salary(BigDecimal.valueOf(130000)).build());
        employeeRepository.save( Employee.builder().name("Fuuc").surname("Pola").sex("female").dateBirth(new Date()).phone("89048896125").email("uasdaw12@mai.com").dateOfLastDay(new Date()).position("Manager").salary(BigDecimal.valueOf(130000)).build());
        employeeRepository.save(Employee.builder().name("Feygin").surname("Mark").sex("female").dateBirth(new Date()).phone("89048896125").email("uasdaw12@mai.com").dateOfLastDay(new Date()).position("Manager").salary(BigDecimal.valueOf(130000)).build());
        employeeRepository.save( Employee.builder().name("Lusia").surname("Arestovich").sex("male").dateBirth(new Date()).phone("89048896125").email("uasdaw12@mai.com").dateOfLastDay(new Date()).position("Manager").salary(BigDecimal.valueOf(130000)).build());
        employeeRepository.save(Employee.builder().name("ALSLS").surname("Psadasda").sex("female").dateBirth(new Date()).phone("89048896125").email("uasdaw12@mai.com").dateOfLastDay(new Date()).position("Manager").salary(BigDecimal.valueOf(130000)).build());

    }
    public void createDepartment(){
        departmentRepository.save(new Department(1L,"Main Office",new Date(),0L));
        departmentRepository.save(new Department(2L,"Main Office1",new Date(),1L));
        departmentRepository.save(new Department(3L,"Main Office2",new Date(),1L));
        departmentRepository.save(new Department(4L,"Main Office22",new Date(),3L));
        departmentRepository.save(new Department(5L,"Main Office33",new Date(),4L));
        departmentRepository.save(new Department(6L,"Main Office44",new Date(),4L));
        departmentRepository.save(new Department(7L,"Main Office55",new Date(),6L));





    }
    @PostConstruct
    public void init(){
        createDepartment();
        createEmployee();

    }
}
