package controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class firstController {
	@RequestMapping("/first.action")
	public String firstRequest(){
		return "/WEB-INF/views/firstResult.jsp";
	}
}
