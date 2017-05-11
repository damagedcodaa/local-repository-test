package com.olav.wfm.controller;

import com.olav.wfm.model.Department;
import com.olav.wfm.model.Employee;
import com.olav.wfm.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Olga A on 10.05.2017.
 */
@Controller
public class MainController {

    /*First method on start application*/
    /*�������� ���� �� ������ ���������� (��. ��������� ��������� � ��������� ���� ����� ������) */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userJSP", new User());
        modelAndView.setViewName("index");
        return modelAndView;
    }

    /*��� ������ �� index.jsp ������������ �����
   <spring:form method="post"  modelAttribute="userJSP" action="check-user">,
   �� ������� ��� ����
    */
    @RequestMapping(value = "/check-user")
    public ModelAndView checkUser(@ModelAttribute("userJSP") User user) {
        ModelAndView modelAndView = new ModelAndView();

        //��� �������������, ���� ����� ����� �������
        modelAndView.setViewName("secondPage");

        //���������� � ������� userJSP (������������ �� �������� *.jsp ������ user
        modelAndView.addObject("userJSP", user);

        return modelAndView; //����� ����� �� �������������, ��������� ���� ����, ���� ��� ����� �������.
    }

    @RequestMapping(value = "/show-departments")
    public ModelAndView showDepartment(@ModelAttribute("dep1") Department dep1) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("departments");

        dep1.setTitle("Department N1");

        Employee emp1 = new Employee();
        emp1.setName("Petr");
        emp1.setSurname("Sidorov");

        Employee emp2 = new Employee();
        emp2.setName("Sergey");
        emp2.setSurname("Ivanov");

        dep1.getEmployees().add(emp1);
        dep1.getEmployees().add(emp2);

        modelAndView.addObject("dep1", dep1);
//        modelAndView.addObject("dep1", dep1.getEmployees());

        return modelAndView; //����� ����� �� �������������, ��������� ���� ����, ���� ��� ����� �������.
    }



}
