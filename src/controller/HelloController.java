package controller;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@Autowired
	private SqlSession session;
	
	@RequestMapping("/hello")
	public String hello(Model model, 
			@RequestParam(value="name",required=false)String name){
		model.addAttribute("greeting","안녕하세요, "+name);
		
		List<Map<String, Object>> resultMap = session.selectList("AccountMapper.selectAll");
		for(Map<String, Object> map : resultMap){
			System.out.println(map);
		}
		
		return "hello";
	}
}
