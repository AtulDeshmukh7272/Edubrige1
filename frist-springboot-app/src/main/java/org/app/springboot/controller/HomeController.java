package org.app.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.app.springboot.controller.mode.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping(path ="/")
	public String home(Model model) {
		model.addAttribute("name","edubrige");
		model.addAttribute("contact","656526426");
		return "index";
	}
	
	
	
	
	
	
/*	@GetMapping("/")
	//@ResponseBody
	public String  homeController() {
		//return "hello world..!!";
	  return "index";
	}
	
	*/
	@RequestMapping("/edubrige")
	//@ResponseBody
	public String  edubrigeControllerMethod() {
		//return " well come to java cource";
		return "about";

	}
	/*@RequestMapping("/contact")
	//@ResponseBody
	public String  contactController() {
		//return " our contact number is 6534123645";
		return "contact";
	}
	*/
	@RequestMapping(path = "/about")   // localhost:8080/about
	//@ResponseBody
	public ModelAndView about()     
	{
		ModelAndView mv=new ModelAndView();
		mv.addObject("aboutus", "We are Workforce development company.");
		mv.setViewName("about");
		//mv.setStatus(HttpsStatus.ok);
		return mv;
	}
	@RequestMapping(path = "/contact")   // localhost:8080/contact
	//@ResponseBody
	public String contact(ModelMap map)     
	{	map.addAttribute("Phone", "93783737737");
		map.addAttribute("email", "contact@edubridge.com");
		return "contact";
	}

	@RequestMapping(path = "/test")   
	public String test(Model model)     
	{	
		List<String> countries=new ArrayList<String>();
		countries.add("India");
		countries.add("UK");
		countries.add("USA");
		
		model.addAttribute("countries",countries);		
		return "test";
	}
	@RequestMapping(path = "/employee")   
	public String getAllemployee(Model model)     
	{	
		Employee emp1=new Employee(101, "Mr. Kostav", "Developer", 23000);
		Employee emp2=new Employee(102, "Mr. Rahul", "Sr. Developer", 30000);
		Employee emp3=new Employee(103, "Ms. Shalini", "Project Manager", 55000);
		
		List<Employee> emplist=List.of(emp1,emp2,emp3);
		
		model.addAttribute("emplist",emplist);		
		return "employee";
	}


	
	

}
