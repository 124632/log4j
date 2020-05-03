package com.xworkz.logger;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Modelmap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class Log4jDemoController {

	private static final Logger logger = Logger.getLogger(LoggerController.class);
	public Log4jDemoController(){
		logger.info(this.getClass().getSimpleName()+"created");
	}
	
	public String welcomePage(ModelMap modelmap){
		modelMap.addAttribute("message","this is log4j web page");
		logger.info(this.getClass().getSimpleName()+"created");
		return "welcome";
		
		
	}
}

