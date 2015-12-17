package controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class fourthController {

	@RequestMapping(value="fourth.action",params=("cart=list"))
	public String fourthRequestPost(){
		
		return "/WEB-INF/views/fourthResult1.jsp";
	}
	@RequestMapping(value="fourth.action",params=("cart=update"))
	public String fourthRequest2(){
		return "/WEB-INF/views/fourthResult2.jsp";
	}
	@RequestMapping(value="fourth.action",params=("cart=delete"))
	public String fourthRequest3(){
		return "/WEB-INF/views/fourthResult3.jsp";
	}
}
