package fr.epita.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import fr.epita.quiz.dao.QuestionDao;
import fr.epita.quiz.entity.Register;

@Controller
@EnableWebMvc
public class RegisterController {
	
	@Autowired
	QuestionDao qDao;
	
	@RequestMapping("register")
	public ModelAndView saveUser(@ModelAttribute Register r)
	{
		System.out.println(r);
		ModelAndView mv = new ModelAndView("index.jsp");  
		 
		qDao.saveUser(r);
		return mv;
	}
	

}
