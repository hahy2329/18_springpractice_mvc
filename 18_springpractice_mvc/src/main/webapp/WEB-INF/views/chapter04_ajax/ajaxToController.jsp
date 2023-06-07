<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath }"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajaxToController</title>
<script src="${contextPath }/resources/jquery/jquery-3.6.1.min.js"></script>
<script>
	$().ready(function(){ //제이쿼리 함수 시작!
		
		$("#btn1").click(function(){
			
			$.ajax({
				
				url : "${contextPath}/ajax/a2cEx01",
				type : "get",
				data : {"productCd" : "0x1234"}
				
			});
			
			
			
		}); //id가 btn1일때 즉 클릭할 때 난 함수를 먹일거다!
		
		
		$("#btn2").click(function(){
			
			var param = {
					
					"productCd" : 1,
					"productNm" : "기계식 키보드",
					"price" : 45000,
					"deliveryPrice" : 2500,
					"enrollDt" : "2023-06-07",
					"brandCd" : "b1"
					
			}
			
			
			$.ajax({
				
				url : "${contextPath}/ajax/a2cEx02",
				type : "get",
				data : param
				
				
			});
		});
		
		$("#btn3").click(function(){
			
			var param = {
					
					"orderCd" : "order1",
					"orderQty" : 3,
					"cartCd" : "cart1",
					"cartQty" : 5
					
					
			}//{"키" : "value"}는 json기법
			
			
			
			$.ajax({
				
				url : "${contextPath}/ajax/a2cEx03",
				type :"get",
				data : param
				
				
			});
			
			
		});
		
		//4.List<DTO>전송
		$("#btn4").click(function(){
			
			var paramList = []; //배열 선언 
			
			for(var i =1; i<11; i++){
				
				var param={
						
						"productCd" : i,
						"productNm" : "무소음마우스" + i,
						"price" : 10000 * i,
						"deliveryPrice" : 2500,
						"enrollDt" : "2023-01-01",
						"brandCd" : "b" + i
						
				};
				
				paramList.push(param); // push함수를 사용하여 배열에 데이터를 대입한다.(add랑 같은 의미)
				
			}
			
			console.log(paramList);
			
			
			
			
			
			
			$.ajax({
				
				url : "${contextPath}/ajax/a2cEx04",
				type : "get",
				data : {"paramList" :JSON.stringify(paramList)} //arrayList형태로 
				
				
			});
			
		});
		
		//List<Map> 전송
		$("#btn5").click(function(){
			
			var paramList = [];
			
			for(var i = 1; i<11; i++){
				
				var param = {
						"orderCd" : "order" + i,
						"orderQty" : i,
						"cartCd" : "cart" + i,
						"cartQty" : i
						
				};
				paramList.push(param);
				
			}
			
			console.log(paramList);
			
			
			
			$.ajax({
				
				url : "${contextPath}/ajax/a2cEx05",
				type : "get",
				data : {"orderMapList" : JSON.stringify(paramList)}
				
				
			});
				
				
				
				
			
			
			
			
		});
		
		
		
		
	});

</script>
</head>
<body>
	<fieldset>
		<legend>AjaxToController</legend>
		<input type="button" id="btn1" value="1) 단일데이터">
		<input type="button" id="btn2" value="2) DTO">
		<input type="button" id="btn3" value="3) map">
		<input type="button" id="btn4" value="4) List(DTO)">
		<input type="button" id="btn5" value="5) List(map)">
	
	
	</fieldset>
</body>
</html>