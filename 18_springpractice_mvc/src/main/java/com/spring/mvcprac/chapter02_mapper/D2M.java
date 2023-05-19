package com.spring.mvcprac.chapter02_mapper;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mvc.dto.BrandDTO;

@Repository
public class D2M {

	@Autowired
	private  SqlSession sqlSession;
	
	
	public void sample01() {
		System.out.println("\n - sample01 - \n");
		
		int productCd = 1;
		sqlSession.update("d2m.sample01", productCd);
		
	}
	
	
	public void sample02() {
		System.out.println("\n - sample02 - \n");
		
		String brandCd = "b6";
		sqlSession.update("d2m.sample02", brandCd);
	}
	
	
	public void sample03() {
		
		System.out.println("\n - sample03 - \n");
		
		String brandNm = "apple";
		
		BrandDTO brandDTO = sqlSession.selectOne("d2m.sample03");
		System.out.println(brandDTO);
	}
}
