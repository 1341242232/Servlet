<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<title></title>
		<link rel="stylesheet" href="/OA_products/css/index.css" />
	</head>
	<body>
		<div class="header">
			<img class="logo" src="/OA_products/img/ia_100000000.png" />
			<div class="navlist">
				<a href="#">我的桌面，Ian</a>
			</div>
			<div class="rightnav">
				<i class="icon1"></i>
				<i class="icon2"></i>
				<i class="icon3 btn"></i>
			</div>
		</div>
		<div class="box1">
			<span >你好，admin</span>
		</div>
		<ul class="leftnav">
			<li>
				<i></i>
				<a href="#">管理中心</a>
			</li>
			<li>
				<i></i>
				<a href="#">管理中心</a>
			</li>
			<li>
				<i></i>
				<a href="#">管理中心</a>
			</li>
			<li>
				<i></i>
				<a href="#">管理中心</a>
			</li>
			<li>
				<i></i>
				<a href="#">管理中心</a>
			</li>
			<li>
				<i></i>
				<a href="#">管理中心</a>
			</li>
			<li>
				<i></i>
				<a href="#">管理中心</a>
			</li>
		</ul>
		<div class="headline">
				<a>产品信息管理</a>
				<a class="href" href="/hahaha/产品管理系统/库存管理/inventory.html">产品库存管理</a>
				<a href="/hahaha/产品管理系统/入库管理/storage.html">产品入库管理</a>
				<a href="/hahaha/产品管理系统/出库管理/delivery.html">产品出库管理</a>
				<a href="/hahaha/产品管理系统/仓库管理/warehouse.html">产品仓库管理</a>
				<a href="/hahaha/产品管理系统/人员管理/administrator.html">仓库管理员</a>
		</div>
		<div class="content">
			<iframe align="center" width="100%" height="100%" src="storage1.jsp"  frameborder="no" border="0" marginwidth="0" marginheight="0" scrolling="no"></iframe>
		</div>
		<div class="right"></div>
	</body>
	<script type="text/javascript">
		var btn = document.getElementsByClassName("btn")[0];
		var right = document.getElementsByClassName("right")[0];
		var i = 0;
		btn.onclick =function(){
			i++;
			if(i%2!=0){
				right.style.right= "0px";
			}else{
				right.style.right= "-200px";
			}
			
		}
		
	</script>
</html>
    