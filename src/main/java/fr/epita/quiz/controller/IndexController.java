package fr.epita.quiz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class IndexController {
	
	
	@RequestMapping("/")
	public String home()
	{
		return "index.jsp";
	}

	
	@RequestMapping("/question.htm")
	public ModelAndView addQuestion()
	{
		ModelAndView mv = new ModelAndView("question.jsp");
		
		return mv;
	}
}
