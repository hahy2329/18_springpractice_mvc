package com.spring.mvcprac.chapter01_form;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //서블릿 역할
@RequestMapping("/c2v") //중복되는 경로는 Controller위에 선언하여 코드의 중복을 줄일 수 있다.

public class C2V_Ex01 {
	
	
	
	@Autowired //jsp로 따지면 싱글톤패턴 같은? 객체를 생성해주는 것 
	private SupposeDAO supposeDAO;
	
	
	
	@GetMapping("/requestEx") //controller의 doget역할
	public String requestEx(HttpServletRequest request) {
		
		request.setAttribute("enrolledProductCnt", supposeDAO.getEnrolledProductCnt());
		request.setAttribute("productDTO", supposeDAO.getProductDetail());
		request.setAttribute("productList", supposeDAO.getProductList());
		request.setAttribute("productMap", supposeDAO.getProductMap());
		request.setAttribute("productMapList", supposeDAO.getProductMapList());
		
		return "chapter01_form/view";
		
		
	}
	
	
	@GetMapping("/modelEx")
	public String modelEx(Model model) {
		
		model.addAttribute("enrolledProductCnt" , supposeDAO.getEnrolledProductCnt());
		model.addAttribute("productDTO" 		  , supposeDAO.getProductDetail());
		model.addAttribute("productList" 		  , supposeDAO.getProductList());
		model.addAttribute("productvMap" 		  , supposeDAO.getProductMap());
		model.addAttribute("productMapList"     , supposeDAO.getProductMapList());
		
		return "chapter01_form/view";
		
	}
	
	
	
	@GetMapping("/modelAndViewEx")
	public ModelAndView modelAndViewEx() { // return 타입은 String이 아닌 ModelAndView 클래스를 작성한다.
		
		//ModelAndView mv = new ModelAndView(); 	 // ModelAndView 객체를 생성한다.
		//mv.setViewName("chapter01_form/view");	 // 포워딩할 jsp 파일경로를 작성한다.
		
		ModelAndView mv = new ModelAndView("chapter01_form/view");
	
		mv.addObject("enrolledProductCnt" , supposeDAO.getEnrolledProductCnt()); // addObject("속성명", 데이터) 메서드를 사용하여 데이터를 뷰로 전송 한다.
		mv.addObject("productDTO" 		  , supposeDAO.getProductDetail());
		mv.addObject("productList" 		  , supposeDAO.getProductList());
		mv.addObject("productMap" 		  , supposeDAO.getProductMap());
		mv.addObject("productMapList"     , supposeDAO.getProductMapList());

		return mv;	
	
	}
	
}
