<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>库存明细</title>
		<link rel="stylesheet" type="text/css" href="/OA_products/css/inventory1.css" />
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
	</head>
	</head>
	<body>
	<form method="post">
	 <input type="hidden" id="op" value="doqueryoroduct">
	</form>
		<div class="box0">
				<div class="box1-nav1">
					<div class="header"><a href="/产品管理系统/首页/index1.html">首页</a> /<a href="#"> 产品库存</a> /<a href="inventory1.html"> 库存管理</a></div>
				<img src="/OA_products/img/QQ图片20190917115833.png"><span>数据列表</span>
			   </div>
		<div class="box1">
			<div class="box1-nav2">
				<div class="inner-div1">
					<div class="nav1">
						<div class="inner-nav2">
							<span class="span1">模糊查询</span>
						</div><input type="text" placeholder="请输入查询条件"/></div>
						
					<div class="nav2">
						<select name="按产品类型选择" >
							<option value="" selected>按产品类型选择</option>
			                <option value="bk" >别克</option>	
			                <option value="xfl" >雪佛兰</option>	
			                <option value="dz" >大众</option>	
			                <option value="fute" >福特</option>	
		                </select>
		            </div>
		            
		            <div class="nav3">
						<div class="inner-nav1">
							<span class="span1">按日期</span>
						</div><input type="date" />-<input type="date" style="border-top-left-radius: 3px;border-bottom-left-radius: 3px;"/></div>						
						<div class="href">
							<a href = "javascript:void(0)" onclick = "document.getElementById('light').style.display='block';document.getElementById('fade').style.display='block'"">高级搜索</a>
						</div>
						<div class="nav1-4">
						<button class="bnt3"><img src="/OA_products/img/QQ图片20190918145747.png" /><span>查询</span></button>
					    </div>  
					</div>
					<p class="likn"></p>
					
					<div class="nav4"> 
						
							<button class="bnt1"><img src="/OA_products/img/QQ图片20190918162145.png" /><span>新增产品</span></button>						
							<button class="bnt2"><img src="/OA_products/img/QQ图片20190918162403.png" /><span>批量删除</span></button>
					</div>
					
					<div class="table" >
						<table cellspacing="1" id="t1">
						<thead>
						<tr class="even">
								<td>产品编号</td>
								<td>
									<input type="checkbox" />
								</td>
								<td>产品名称</td>
								<td>产品类型</td>
								<td>产品规格</td>
								<td>库存数量</td>
								<td>存入仓库</td>
								<td>存入日期</td>
								<td>存入备注</td>
								<td>存入人员</td>
								<td>操作</td>
							</tr>
						</thead>
						<tbody id="tbody" style="color: red;">
						
						</tbody>
						</table>
					</div>
						<div class="nav5">
							<div class="nav5-1">
								共查询到<span>xxx</span>条记录!
							</div>
						    <div class="rage">
							<button>上一页</button>
							<button>1</button>
							<button>2</button>
							<button>3</button>
							<button>4</button>
							<button>5</button>
							<button>下一页</button>
						    </div>
						    <div class="nav5-2">
						    	<button >跳转至</button><input type="text" />/页面,共<span>xxx</span>页
						    </div>
						</div>
			</div>
			</div>
		</div>
		 <div id="light" class="white_content">
		 	<p>高级搜索</p>
		 	<div class="onck-div">
		 		 <form>
		 		<div class="onck1">
		 			<div class="onck1-left">
		 				<div class="onck-text">
		 					 <span> 关键词 </span> <input type="text" placeholder="请输入产品编号/名称/类型/规格"/>
		 				</div>
		 				
		 			    <div class="onck-text">
		 			    	<span> 按分类 </span> <select name="全部分类" />
							<option value="" selected>全部分类</option>
			                <option value="bk" >别克</option>	
			                <option value="xfl" >雪佛兰</option>	
			                <option value="dz" >大众</option>	
			                <option value="fute" >福特</option>	
		                    </select>
		 			    </div>
		 			 
		 			</div>
		 		</div>
		 		<div class="onck1">
		 				<div class="onck1-left">
		 				   <div class="onck-text">
		 					<span class="onck-span"> 按仓库 </span> <select name="全部仓库" />
							<option value="" selected>全部仓库</option>
			                <option value="bk" >美国仓库</option>	
			                <option value="xfl" >日本仓库</option>	
			                <option value="dz" >中国仓库</option>	
			                <option value="fute" >英国仓库</option>	
		                    </select>
		 				   </div>
		 				   <div class="onck-date">
		 					<span>按日期 </span><input type="datetime-local" />-<input type="datetime-local" />
		 				    </div>
		 				</div>
		 		</div>
		 		<div class="onck1">
		 		    <div class="onck1-left">
		 		       <div class="onck-text">
		 		       <span>按品牌 </span><select name="全部品牌" />
							<option value="" selected>按品牌</option>
			                <option value="bk" >美国仓库</option>	
			                <option value="xfl" >日本仓库</option>	
			                <option value="dz" >中国仓库</option>	
			                <option value="fute" >英国仓库</option>	
		                    </select>
		 		       </div>
		 		        <div class="onck-text">
		 			    	<span>审批人  </span> <select name="全部分类" />
							<option value="" selected>审批人</option>
			                <option value="bk" >别克</option>	
			                <option value="xfl" >雪佛兰</option>	
			                <option value="dz" >大众</option>	
			                <option value="fute" >福特</option>	
		                    </select>
		 			    </div>
		 		    </div>
		 		</div>
		 		<div class="onck1">
		 		    <div class="onck1-left">
		 		       <div class="onck-text">
		 		       <span>供应商  </span><select name="全部品牌" />
							<option value="" selected>供应商</option>
			                <option value="bk" >美国仓库</option>	
			                <option value="xfl" >日本仓库</option>	
			                <option value="dz" >中国仓库</option>	
			                <option value="fute" >英国仓库</option>	
		                    </select>
		 		       </div>
		 		        <div class="onck-text">
		 			    	<span>来源地  </span> <input type="text" placeholder="请输入产品的来源地址"/>
		 			    </div>
		 		    </div>
		 		</div>
		 		<div class="btn4">
		 			<div class="btn-4-2">
		 			<p class="btn4-1" onclick = "document.getElementById('light').style.display='none';document.getElementById('fade').style.display='none'">关 闭	
		 			</p></div>
		 			<div class="btn4-2">
		 				<input type="button" value="确 定">
		 			</div>
		 			<div class="btn4-3">
		 				<input type="button" value="重 置">
		 			</div>
		 		</div>
		 		 </form>
		 	</div>
		 </div> 
        <div id="fade" class="black_overlay"></div> 
		</div>
	</body>
</html>
<script type="text/javascript" src="${pageContext.request.contextPath}/jquery/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
   
   $(function(){
   
		var op = $("#op").val();

        var d = {
        		"op":op	
    	};
        
		$.ajax({
			type:"POST",
			url:"${pageContext.request.contextPath}/doInventoryServlet",
			async:true,
			traditional:true,
			dateType:"json",
			contentType:"application/json;charset=utf-8",
			data:JSON.stringify(d),
			
			beforeSend: function () {
				
			},
			success:function(result){
				var objs=eval(result);
				var con;
				if (objs == null || objs == "") {
					document.getElementById("tbody").innerHTML = "暂无库存记录!";
				}
				  $.each(objs,function(i,n){
					  con +="<tr><td>"+n.pId+"</td><td><input type='checkbox' />"+"</td><td>"+n.iName+"</td><td>"+n.iType+"</td><td>"+n.iSpecification+"</td><td>"+n.iNumber+"</td><td>"+n.storageId+"</td><td>"+n.iDate+"</td><td>"+n.remark+"</td><td>"+n.transactor+"</td>";
					  con +="<td>"+
							"<a class='a1' href='#'  title='删除'><div  class='button-div1' style='width: 25px;height: 25px;'><img src='/OA_products/img/QQ图片20190928094637.png'/></div></a>"+
							"<a class='a1' href='#'  title='修改'><div  class='button-div2' style='width: 25px;height: 25px;'><img src='/OA_products/img/QQ图片20190928094304.png'/></div></a>"+
							"<a class='a1' onclick='deleteproduct("+n.inventoryId+")' title='删除' href='#'><div  class='button-div3' style='width: 25px;height: 25px;'><img src='/OA_products/img/QQ图片20190918162403.png'/></div></a>"
						+"</td></tr>";
				  });
				  
				  $("#t1 tbody").html(con);
				  $("tbody tr:even").css("background-color","#f4f4f4");
				  $("tody tr:odd").css("background-color","white");
			}
			
		});	
})

function deleteproduct(Id) {
			alert(Id);
			var a = "dodeleteProduct";
			var s = {
					"inventoryId":Id,
					"op":a
			};
	                	$.ajax({
	        				type:"post",
	        				url:"${pageContext.request.contextPath}/doInventoryServlet",
	        				async:true,
	        				traditional:true,
	        				dateType:"json",
	        				contentType:"application/json;charset=utf-8",
	        				data:JSON.stringify(s),
	        				
	        				success:function(result){
	        					if (result.success) {
	        						window.location.href="http://localhost:8090/OA_products/view/inventory/inventory1.jsp";
								}
	        				},
	        				error:function(t){
	        					if (!t.error) {
									alert(t.data);
								}
	        				}
	        			});
		}
</script>