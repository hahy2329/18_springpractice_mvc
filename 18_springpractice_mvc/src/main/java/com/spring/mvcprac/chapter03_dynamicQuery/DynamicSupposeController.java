package com.spring.mvcprac.chapter03_dynamicQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dynamicQuery")
public class DynamicSupposeController {

	@Autowired
	private DynamicQueryDAO dynamicQueryDAO;
	
	@GetMapping("/ifEx")
	public String ifEx() {
	
		dynamicQueryDAO.ifEx();
		return "home";
	}
	
}
