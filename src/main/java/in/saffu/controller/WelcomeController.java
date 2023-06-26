package in.saffu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@GetMapping("/welcome")
	public ModelAndView welcome() {
		ModelAndView mvn = new ModelAndView();
		mvn.addObject("msg", "hlo sarfraz ,how are you?");
		mvn.setViewName("index");
		return mvn;
	

	}
	
	@GetMapping("/greet")
	public String Greeting(Model model)
	{
		model.addAttribute("msg", "Good mornig.....");
		
		return "index";
	}

}













