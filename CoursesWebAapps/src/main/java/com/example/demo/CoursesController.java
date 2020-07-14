package com.example.demo;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class CoursesController {
	@RequestMapping("courses")
	@ResponseBody
	public String courss() {
		System.out.println("Welcome to edureka");
		return "course";

	}

}
