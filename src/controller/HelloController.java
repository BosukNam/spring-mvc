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
		
		if(name != null && !name.isEmpty())
			model.addAttribute("greeting","안녕하세요, "+name);
		else
			model.addAttribute("greeting","페이지 방문을 환영합니다! :)");
		
		List<Map<String, Object>> resultMapList = session.selectList("AccountMapper.selectAll");
		model.addAttribute("dataset", resultMapList);
		
		return "hello";
	}
}
