package com.spring.mvcprac.chapter02_mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mvc.dto.BrandDTO;
import com.spring.mvc.dto.ProductDTO;

@Repository
public class M2D {

	@Autowired
	private SqlSession sqlSession;
	
	
	
	//DTO List 반환 예시1
	public void ex01() {
		
		System.out.println("\n - ex01 - \n");
		List<ProductDTO> productList = sqlSession.selectList("m2d.ex01");
		
		for(ProductDTO productDTO : productList) {
			System.out.println(productDTO);
		}
	}
	
	public void ex02() {
		System.out.println("\n - ex02 - \n");
		List<BrandDTO> brandList = sqlSession.selectList("m2d.ex02");
		
		for(BrandDTO brandDTO : brandList) {
			System.out.println(brandDTO);
		}
		
	}
	
	public void ex03() {
		
		System.out.println("\n - ex03 - \n");
		ProductDTO productDTO = sqlSession.selectOne("m2d.ex03");
		
		System.out.println(productDTO);
		
	}
	
	public void ex04() {
		
		System.out.println("\n - ex04 - \n");
		BrandDTO brandDTO = sqlSession.selectOne("m2d.ex04");
		
		System.out.println(brandDTO);
		
	}
	
	public void ex05() {
		
		System.out.println("\n - ex05 - \n");
		int productCd = sqlSession.selectOne("m2d.ex05");
		
		System.out.println(productCd);
	}
	
	public void ex06() {
		
		System.out.println("\n - ex06 - \n");
		double price = sqlSession.selectOne("m2d.ex06");
		
		System.out.println(price);
	}
	
	public void ex07() {
		
		System.out.println("\n - ex07 - \n");
		String productNm = sqlSession.selectOne("m2d.ex07");
		
		System.out.println(productNm);
		
	}
	
	public void ex08() {
		
		System.out.println("\n - ex08 - \n");
		List<ProductDTO> productList = sqlSession.selectOne("m2d.ex08");
		
		for(ProductDTO productDTO : productList) {
			System.out.println(productDTO);
		}

	}
	
	public void ex09() {
		System.out.println("\n - ex09 - \n");
		List<Map<String,Object>> productMapList = sqlSession.selectList("m2d.ex09");
	
		
		for(Map<String,Object>productMap : productMapList ) {
			System.out.println(productMap);
		}
	}
	
	public void ex10() {
		System.out.println("\n - ex10 - \n");
		List<Map<String,Object>> productMapList = sqlSession.selectList("m2d.ex10");
		
		for(Map<String,Object> productMap : productMapList) {
			System.out.println(productMap);
		}
		
	}
	
	public void ex11() {
		System.out.println("\n - ex11 - \n");
		List<Map<String,Object>> joinMap = sqlSession.selectList("m2d.ex11");
		
		for(Map<String,Object> map : joinMap) {
			System.out.println(map);
		}
	}
	
	
}
