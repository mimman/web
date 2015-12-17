package controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class secondController {
	@RequestMapping("/second.action")
	public ModelAndView secondRequest(HttpServletRequest req){
		String param1 = req.getParameter("param1");
		String param2 = req.getParameter("param2");
		//req.setAttribute("param1", param1);
		//req.setAttribute("param2", param2);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/views/secondResult.jsp");
		mav.addObject("param1",param1);
		mav.addObject("param2",param2);
		return mav;
	}
	
	@RequestMapping(value="/second.action",method=RequestMethod.POST)
	public ModelAndView secondRequestPost(HttpServletRequest req) throws UnsupportedEncodingException{
		
		String id = req.getParameter("id");
		
		//req.setAttribute("id", id);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/views/secondResult.jsp");
		mav.addObject("id", id);
		
		return mav;
	}
}
