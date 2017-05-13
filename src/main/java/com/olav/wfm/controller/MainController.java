package com.olav.wfm.controller;

import com.olav.wfm.dao.EmployeeDAO;
import com.olav.wfm.dao.ResourceGroupDAO;
import com.olav.wfm.model.Department;
import com.olav.wfm.model.Employee;
import com.olav.wfm.model.ResourceGroup;
import com.olav.wfm.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        ResourceGroupDAO resourceGroupDAO = (ResourceGroupDAO) context.getBean("resourceGroupDAO");

        List<ResourceGroup> rs_list =  resourceGroupDAO.getAllResourceGroups();
        System.out.println("list = " + rs_list);
        System.out.println("list1 = " + rs_list.get(0).getName());
        System.out.println("list2 = " + rs_list.get(1).getName());
        System.out.println("list3 = " + rs_list.get(2).getName());

        modelAndView.addObject("resourceGroupList", rs_list);
        modelAndView.setViewName("new_index");
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

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("employeeDAO");
        for (Employee emp : employeeDAO.getAllEmployees()) {
            dep1.getEmployees().add(emp);
        }
        modelAndView.addObject("dep1", dep1);

        return modelAndView; //����� ����� �� �������������, ��������� ���� ����, ���� ��� ����� �������.
    }



}
