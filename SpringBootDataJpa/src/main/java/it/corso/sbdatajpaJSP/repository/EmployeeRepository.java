package it.corso.sbdatajpaJSP.repository;

import it.corso.sbdatajpaJSP.domain.Employee;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Luigi Brandolini
 */
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>,
        EmployeeRepositoryCustom {
    //Implementation AUTO-GENERATED By Spring-Data-Jpa
    public List<Employee> findByEmailIgnoreCaseContaining(String email);
    public List<Employee> findByGenderAndDepartmentName(char gender, String email);    
    public List<Employee> findByDepartmentNameContainingIgnoringCase(String name);    
}