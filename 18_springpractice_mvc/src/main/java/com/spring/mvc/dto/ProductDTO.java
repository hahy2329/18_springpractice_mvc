package com.spring.mvc.dto;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;


@Component
public class ProductDTO {
	private int productCd; //상품코드
	private String productNm; // 상품이름
	private int price; //상품가격
	private int deliveryPrice; //배달료 
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date enrollDt; //등록날짜
	private String brandCd; // 상품 브랜드의 코드
	private List<ProductDTO> productList;
	
	
	
	public int getProductCd() {
		return productCd;
	}
	public void setProductCd(int productCd) {
		this.productCd = productCd;
	}
	public String getProductNm() {
		return productNm;
	}
	public void setProductNm(String productNm) {
		this.productNm = productNm;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDeliveryPrice() {
		return deliveryPrice;
	}
	public void setDeliveryPrice(int deliveryPrice) {
		this.deliveryPrice = deliveryPrice;
	}
	public Date getEnrollDt() {
		return enrollDt;
	}
	public void setEnrollDt(Date enrollDt) {
		this.enrollDt = enrollDt;
	}
	public String getBrandCd() {
		return brandCd;
	}
	public void setBrandCd(String brandCd) {
		this.brandCd = brandCd;
	}
	public List<ProductDTO> getProductList() {
		return productList;
	}
	public void setProductList(List<ProductDTO> productList) {
		this.productList = productList;
	}
	@Override
	public String toString() {
		return "ProductDTO [productCd=" + productCd + ", productNm=" + productNm + ", price=" + price
				+ ", deliveryPrice=" + deliveryPrice + ", enrollDt=" + enrollDt + ", brandCd=" + brandCd
				+ ", productList=" + productList + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
}
