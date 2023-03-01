package com.example.spring_boot.service;

import com.example.spring_boot.dao.EmployeeRepo;
import org.springframework.stereotype.Service;
import com.example.spring_boot.entity.Employee;
//import com.example.spring_boot.exception.EmployeeException;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    private EmployeeRepo employeeRepo;

    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }


    @Override
    public List<Employee> getEmployees() {
        return employeeRepo.findAll();
    }


    @Override
    public Employee getEmployeeById(int id) {
        return employeeRepo.findById(id).get();
    }


    @Override
    public void addEmployee(Employee employee) {
        employee.setId(null);
        employeeRepo.save(employee);
    }


    @Override
    public void updateEmployee(Employee employee) {
        employeeRepo.save(employee);
    }


    public void deleteEmployee(int id) {
        employeeRepo.deleteById(id);

    }


    //    private EmployeeDAO employeeDAO;

    //    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
//        this.employeeDAO = employeeDAO;
//    }
    //    @Override
//    @Transactional
//    public List<Employee> getEmployees() {
//        return employeeDAO.getEmployees();
//    }
    //
//    @Override
//    @Transactional
//    public Employee getEmployeeById(int id) {
//        return employeeDAO.getEmployeeById(id);
//    }
    //    @Override
//    @Transactional
//    public void addEmployee(Employee employee) {
//        employee.setId(null);
//        employeeDAO.addEmployee(employee);
//    }
    //    @Override
//    @Transactional
//    public void updateEmployee(Employee employee) {
//        employeeDAO.updateEmployee(employee);
//    }

    //    @Override
//    @Transactional
//    public void deleteEmployee(int id) {
//        Employee employee = employeeDAO.getEmployeeById(id);
//
//        if (employee == null) {
//            throw new EmployeeException("Employee with id = " + id + " doesn't exist");
//        }
//        employeeDAO.deleteEmployee(id);
//    }


}