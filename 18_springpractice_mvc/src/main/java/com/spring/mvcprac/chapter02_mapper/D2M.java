package com.spring.mvcprac.chapter02_mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.mvc.dto.BrandDTO;
import com.spring.mvc.dto.ProductDTO;

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
	
	public void sample04() {
		System.out.println("\n - sample04 - \n");
		
		BrandDTO brandDTO = new BrandDTO();
		brandDTO.setBrandCd("add1");
		brandDTO.setBrandNm("추가된 브랜드");
		brandDTO.setActiveYn("N");
		
		sqlSession.insert("d2m.sample04", brandDTO);
		
		
		
		
	}
	
	
	public void sample05() {
		
		System.out.println("\n - sample05 - \n");
		
		ProductDTO productDTO = new ProductDTO();
		
		productDTO.setProductNm("추가된 상품1");
		productDTO.setPrice(1);
		productDTO.setDeliveryPrice(1);
		productDTO.setBrandCd("add");
		sqlSession.insert("d2m.sample05", productDTO);
	}
	
	
	public void sample06() {
		
		System.out.println("\n - sample06 -\n");
		
		ProductDTO productDTO = new ProductDTO();
		productDTO.setPrice(1000000);
		productDTO.setDeliveryPrice(3000);
		
		
		List<ProductDTO> productList = sqlSession.selectList("d2m.sample06",productDTO);
		
		for(ProductDTO productDTO2 : productList) {
			System.out.println(productDTO2);
		}
	}
	
	
	public void sample07() {
		System.out.println("\n - sample07 -\n");
		
		Map<String, Integer> priceMap = new HashMap<String,Integer>();
		priceMap.put("min", 500000);
		priceMap.put("max", 1000000);
		
		List<ProductDTO> productList = sqlSession.selectList("d2m.sample07", priceMap);
		for(ProductDTO productDTO : productList) {
			System.out.println(productDTO);
		}
		
		
	}
	
	public void sample08() {
		System.out.println("\n - sample08 - \n");
		
		Map<String,String> dateMap = new HashMap<String, String>();
		dateMap.put("startDate", "2021-01-01");
		dateMap.put("endDate", "2021-03-31");
		List<BrandDTO> brandList = sqlSession.selectList("d2m.sample08", dateMap);
		for(BrandDTO brandDTO : brandList) {
			System.out.println(brandDTO);
		}
	}
	
	public void sample09() {
		System.out.println("\n - sample09 - \n");
		
		Map<String, Object> searchMap = new HashMap<String,Object>();
		searchMap.put("activeYn", "N");
		searchMap.put("price", 1000000);
		
		List<Map<String, Object>> searchMapList = sqlSession.selectList("d2m.sample09", searchMap);
		for(Map<String,Object> map : searchMapList) {
			System.out.println(map);
		}
	}
	
	
	
	
	
}
