package com.mondal.springboot.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mondal.springboot.entity.Student;
import com.mondal.springboot.exceptions.ResourceNotFoundException;
import com.mondal.springboot.repository.StudentRepository;
	
@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    // http://localhost:8081/angular-springboot/api/v1/students
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
    
    // http://localhost:8081/angular-springboot/api/v1/students/17
    @Primary
    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getEmployeeById(@PathVariable(value = "id") Long employeeId)
        throws ResourceNotFoundException {
        Student employee = studentRepository.findById(employeeId)
          .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));
        return ResponseEntity.ok().body(employee);
    }
    
    // http://localhost:8081/angular-springboot/api/v1/students
    @PostMapping("/students")
    public Student createEmployee(@Validated @RequestBody Student employee) {
        return studentRepository.save(employee);
    }

    // http://localhost:8081/angular-springboot/api/v1/students/17
    @PutMapping("/students/{id}")
    public ResponseEntity<Student> updateEmployee(@PathVariable(value = "id") Long employeeId,
         @Validated @RequestBody Student employeeDetails) throws ResourceNotFoundException {
        Student employee = studentRepository.findById(employeeId)
        .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

        employee.setFirstName(employeeDetails.getFirstName());
        employee.setLastName(employeeDetails.getLastName());
        employee.setEmailId(employeeDetails.getEmailId());
        employee.setProgramEnrolled(employeeDetails.getProgramEnrolled());
        employee.setSemesterEnrolled(employeeDetails.getSemesterEnrolled());
        employee.setAddress(employeeDetails.getAddress());
        employee.setCity(employeeDetails.getCity());
        employee.setPostalCode(employeeDetails.getPostalCode());
        
        final Student updatedEmployee = studentRepository.save(employee);
        return ResponseEntity.ok(updatedEmployee);
    }
    
    // http://localhost:8081/angular-springboot/api/v1/students/17
    @DeleteMapping("/students/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
         throws ResourceNotFoundException {
        Student employee = studentRepository.findById(employeeId)
       .orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + employeeId));

        studentRepository.delete(employee);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}