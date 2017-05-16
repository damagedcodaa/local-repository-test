package com.olav.wfm.controller;

import com.olav.wfm.dao.ResourceGroupDAO;
import com.olav.wfm.dao.ServingAreaDAO;
import com.olav.wfm.model.Department;
import com.olav.wfm.model.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        ResourceGroupDAO resourceGroupDAO = (ResourceGroupDAO) context.getBean("resourceGroupDAO");
        modelAndView.addObject("resourceGroupList", resourceGroupDAO.getAllResourceGroups());
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(value = "/create-resource-group", method = RequestMethod.GET)
    public ModelAndView createResourceGroup() {
        ModelAndView modelAndView = new ModelAndView();

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        ServingAreaDAO servingAreaDAO = (ServingAreaDAO) context.getBean("servingAreaDAO");
        modelAndView.addObject("servingAreaList", servingAreaDAO.getAllServingAreas());
        modelAndView.setViewName("createResourceGroup");
        return modelAndView;
    }

    @RequestMapping(value = "/serving-areas")
    public ModelAndView showServingAreas() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("servingAreas");
        return modelAndView;
    }

    /*��� ������ �� index_old.jsp ������������ �����
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

    @RequestMapping(value = "/departments")
    public ModelAndView showDepartment(@ModelAttribute("dep1") Department dep1) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("departments");

//        dep1.setTitle("Department N1");
//
//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        EmployeeDAO employeeDAO = (EmployeeDAO) context.getBean("employeeDAO");
//        for (Employee emp : employeeDAO.getAllEmployees()) {
//            dep1.getEmployees().add(emp);
//        }
//        modelAndView.addObject("dep1", dep1);

        return modelAndView; //����� ����� �� �������������, ��������� ���� ����, ���� ��� ����� �������.
    }

    @RequestMapping(value = "/main")
    public ModelAndView showMain() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("main");
        return modelAndView;
    }



}
