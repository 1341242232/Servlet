<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登录页面</title>
</head>
<body>
<form id="form1" method="post">
     <input type="hidden" id="op" value="UserLogin" />
   帐号：<input type="text" id="userAccount" placeholder="请输入要登录的帐号" /><br>
   密码：<input type="text" id="userPassword" placeholder="请输入要登录的密码" /><br>
   <span id="span" style="color: red;font-size: 12px"></span><br>
       <input type="button" value="登录" id="bnt"/>
</form>
</body>
</html>
<script type="text/javascript" src="/OA_product/jquery/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#bnt").click(function(){
		var op = $("#op").val();
		var userAccount = $("#userAccount").val();
		var userPassword = $("#userPassword").val();
		
		var d = {
				"op":op,
				"userAccount":userAccount,
				"userPassword":userPassword
		};
		
		$.ajax({
			type:"POST",
			url:"${pageContext.request.contextPath}/TestServlet",
			async:true,
			traditional:true,
			dateType:"json",
			contentType:"application/json;charset=utf-8",
			data:JSON.stringify(d),
				
			success:function(result){
					if (result.success) {
						window.location.href="http://localhost:8090/OA_product/view/index/index.jsp";
					}
			},
			error:function(result){
				if (!result.data) {
					alert(result.data+"aa");
					document.getElementById("span").innerHTML = "密码错误,请重新登录!";
				}
			}
		});
	})
})
</script>