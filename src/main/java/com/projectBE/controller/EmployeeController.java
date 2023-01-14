package com.projectBE.controller;

import com.projectBE.entity.Employee;
import com.projectBE.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @RequestMapping(value = "/")
    public ModelAndView viewHomePage() {
        ModelAndView mav = new ModelAndView("index");
        List<Employee> listEmployees = service.listAll();
        mav.addObject("listEmployees", listEmployees);

        return mav;
    }

    @RequestMapping("/employees")
    public List<Employee> getAllEmployees() {
        return service.listAll();
    }

    @RequestMapping("/new")
    public ModelAndView showNewEmployeeForm() {
        ModelAndView mav = new ModelAndView("new_employee");
        Employee employee = new Employee();
        mav.addObject("employee",employee);

        return mav;
    }

    @PostMapping("/save")
    public ModelAndView saveEmployee(@ModelAttribute("employee") Employee employee) {
        service.save(employee);
        ModelAndView mav = new ModelAndView("index");
        List<Employee> listEmployees = service.listAll();
        mav.addObject("listEmployees", listEmployees);

        return mav;
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditEmployeeForm(@PathVariable(name = "id") Long id) {
        ModelAndView mav = new ModelAndView("edit_employee");

        Employee employee = service.get(id);
        mav.addObject("employee", employee);

        return mav;
    }

    @RequestMapping("/delete/{id}")
    public ModelAndView deleteEmployee(@PathVariable(name = "id") Long id) {
        service.delete(id);
        ModelAndView mav = new ModelAndView("index");
        List<Employee> listEmployees = service.listAll();
        mav.addObject("listEmployees", listEmployees);
        return mav;
    }
}
