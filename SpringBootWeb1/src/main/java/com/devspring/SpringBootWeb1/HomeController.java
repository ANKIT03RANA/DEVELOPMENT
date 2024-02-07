package com.devspring.SpringBootWeb1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        System.out.println("home method called");
        return "index.jsp"; //we are sending view to client
    }

    
    // public String add(@RequestParam("num1")int num1,@RequestParam("num2")int num2, HttpSession session){ // like this also we can access those params
    // public String add(HttpServletRequest req, HttpSession session){
    //     System.out.println("add method called");

    //     int num1 = Integer.parseInt(req.getParameter("num1"));
    //     int num2 = Integer.parseInt(req.getParameter("num2"));
    //     int result = num1 + num2;

    //     session.setAttribute("result", result);
    //     return "result.jsp";
    // }
    // public String add(@RequestParam("num1")int num1,@RequestParam("num2")int num2, Model model){ //Model 

    //     int result = num1+num2;
    //     model.addAttribute("result", result);
    //     return "result.jsp";

    // }
    @RequestMapping("add")
    public ModelAndView add(@RequestParam("num1")int num1,@RequestParam("num2")int num2, ModelAndView mv){ //Model and View Object

        int result = num1+num2;
        mv.addObject("result", result);
        mv.setViewName("result");
        return mv;

    }
    @RequestMapping("addAlien")//with the help of modelattribute we dont need to receive params separately we can receive it using class having same params
    public String addAlien(@ModelAttribute("alien")Alien alien) { //if we dont use modelAttribute it will work because modelattribute is optional but then we have to use the same object name is result(i.e. view)
        return "resutl";
    }
    
    @ModelAttribute("course")
    public String courseName(){
        return "java";
    }


}
