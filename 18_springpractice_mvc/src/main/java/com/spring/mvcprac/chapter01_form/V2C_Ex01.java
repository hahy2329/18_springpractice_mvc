package com.spring.mvcprac.chapter01_form;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.dto.ProductDTO;

@Controller
public class V2C_Ex01 {

	@GetMapping("/input")
	public String input() {
		
		return "chapter01_form/input";
	}
	
	
	@PostMapping("/modelAttribute")
	public String modelAttribute(@ModelAttribute ProductDTO productDTO) {
		
		System.out.println("\n ModelAttribute \n");
		System.out.println(productDTO);
		System.out.println();
		
		return "chapter01_form/input";
		
		
	}
	
	@PostMapping("/map")
	public String map(@RequestParam Map<String, Object> productMap) {
		
		System.out.println("\n @RequestParam map \n");
		System.out.println(productMap);
		System.out.println();
		
		return "chapter01_form/input";
		
	}
	
	
	
	
}
