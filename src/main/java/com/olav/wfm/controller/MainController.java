package com.olav.wfm.controller;

import com.olav.wfm.dao.EmployeeDAO;
import com.olav.wfm.model.Department;
import com.olav.wfm.model.Employee;
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
    /*Попадаем сюда на старте приложения (см. параметры аннотации и настройки пути после деплоя) */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView main() {
        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("userJSP", new User());
        modelAndView.setViewName("new_index");
        return modelAndView;
    }

    /*как только на index.jsp подтвердится форма
   <spring:form method="post"  modelAttribute="userJSP" action="check-user">,
   то попадем вот сюда
    */
    @RequestMapping(value = "/check-user")
    public ModelAndView checkUser(@ModelAttribute("userJSP") User user) {
        ModelAndView modelAndView = new ModelAndView();

        //имя представления, куда нужно будет перейти
        modelAndView.setViewName("secondPage");

        //записываем в атрибут userJSP (используется на странице *.jsp объект user
        modelAndView.addObject("userJSP", user);

        return modelAndView; //после уйдем на представление, указанное чуть выше, если оно будет найдено.
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

        return modelAndView; //после уйдем на представление, указанное чуть выше, если оно будет найдено.
    }



}
