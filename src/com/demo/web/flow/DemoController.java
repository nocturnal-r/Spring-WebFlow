package com.demo.web.flow;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class DemoController {
 
	@RequestMapping("home")
	public String home(){
		return "index";
	}
}
