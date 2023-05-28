package com.spring.mvcprac.chapter03_dynamicQuery;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mvc.dto.ProductDTO;

@Repository
public class DynamicQueryDAO {
	
	@Autowired
	private SqlSession sqlSession;
	
	
	//if 사용 예시
	public void ifEx() {
		
		System.out.println("\n --- ifEx ---- \n");
		
		Map<String,Object> searchMap = new HashMap<String,Object>();
		
		searchMap.put("searchKeyWord", "enrollDt");
		searchMap.put("searchWord", "2022");
		searchMap.put("searchKeyWord", "productNm");
		searchMap.put("searchWord","삼성전자");
		
		List<ProductDTO> productList = sqlSession.selectList("dynamicQuery.ifEx", searchMap);
		for(ProductDTO productDTO : productList) {
			System.out.println(productDTO);
		}
		
		
		
	}
	
}
