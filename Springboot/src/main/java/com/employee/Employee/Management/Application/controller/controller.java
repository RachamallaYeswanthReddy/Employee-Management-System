package com.employee.Employee.Management.Application.controller;

import com.employee.Employee.Management.Application.Repository.EmpRepository;
import com.employee.Employee.Management.Application.exception.ResourceNotFoundException;
import com.employee.Employee.Management.Application.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class controller {
    @Autowired
    public EmpRepository empRepository;

    @GetMapping("/employees")
    public List<Employee> getAllEmployees(){
        return empRepository.findAll();
    }
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
        Employee employee = empRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
        return ResponseEntity.ok(employee);
    }
    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee employee){
        return empRepository.save(employee);
    }

    @PutMapping("/employees/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Long id,
        @RequestBody Employee employeedetails)
                throws ResourceNotFoundException{
            Employee employee = empRepository.findById(id)
                    .orElseThrow(() -> new ResourceNotFoundException(("Employee Not found for this id: "+id)));
            employee.setEmailId(employeedetails.getEmailId());
            employee.setFirstName(employeedetails.getFirstName());
            employee.setLastName(employeedetails.getEmailId());
            final Employee updatedEmployee = empRepository.save(employee);
            return ResponseEntity.ok(updatedEmployee);
    }
    @DeleteMapping("/employees/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
            throws ResourceNotFoundException {
        Employee employee = empRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

        empRepository.delete(employee);

        empRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("Deleted", Boolean.TRUE);
        return response;
    }
}
