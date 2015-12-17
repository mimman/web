package controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class thirdController {
	@RequestMapping("/third.action")
	public ModelAndView secondRequest(HttpServletRequest req){
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/WEB-INF/views/thirdResult.jsp");
		ArrayList<String> data1 = new ArrayList<String>();
		data1.add("삼계탕");
		data1.add("순대국");
		data1.add("육계장");
		data1.add("추어탕");
		
		mav.addObject("foodList",data1);
		
		Map<String, String> data2 = new HashMap<String,String>();
		data2.put("f1", "사과");
		data2.put("f2", "감");
		data2.put("f3", "귤");
		
		mav.addAllObjects(data2);
		
		ArrayList day = new ArrayList();
		day.add("월요일");
		day.add("화요일");
		day.add("수요일");
		
		Map data3 = new HashMap<String,ArrayList>();
		data3.put("day", day);
		
		mav.addAllObjects(data3);
		return mav;
	}
	

}
