package com.employee.Employee.Management.Application.Repository;

import com.employee.Employee.Management.Application.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends JpaRepository<Employee,Long> {

}
