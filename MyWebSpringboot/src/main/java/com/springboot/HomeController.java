package com.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public ModelAndView home(Home home) {

		ModelAndView mv = new ModelAndView();
		//System.out.println(myFirstName+"  "+myLastName);
		mv.addObject("obj", home);
		//mv.addObject("lastName", myLastName);
		mv.setViewName("home");
		return mv;

	}

}
